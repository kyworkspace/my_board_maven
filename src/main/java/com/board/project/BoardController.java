package com.board.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	

}
