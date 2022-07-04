package com.board.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.board.project.entity.BoardEntity;
import com.board.project.entity.BoardEntityDto;
import com.board.project.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;

	@PostMapping("/save")
	public BoardEntityDto.Response boardSave(@RequestBody BoardEntityDto.saveCriteria parameter) {
		return boardService.save(parameter);
	}

	@GetMapping("/list")
	public BoardEntityDto.Response boardList(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
		BoardEntityDto.Response resultSet = new BoardEntityDto.Response();
		try {
			List<BoardEntity> boardList = boardService.getList(pageNumber, pageSize);
			resultSet.setSuccess("true");
			resultSet.setSuccessFlag(true);
			resultSet.setData(boardList);
		} catch (Exception e) {
			e.printStackTrace();
			resultSet.setSuccess("false");
			resultSet.setSuccessFlag(false);
			resultSet.setMessage("호출중 오류가 발생하였습니다.");
		}

		return resultSet;

	}

}
