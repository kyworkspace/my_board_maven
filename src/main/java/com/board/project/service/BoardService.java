package com.board.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.project.entity.BoardEntity;
import com.board.project.entity.BoardEntityDto;
import com.board.project.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;

	public BoardEntityDto.Response save(BoardEntityDto.saveCriteria parameter) {
		
		BoardEntityDto.Response res = new BoardEntityDto.Response();
		
		try {
			BoardEntity board = new BoardEntity();
			
			board.setUserId(parameter.getUserId());
			board.setBoardTitle(parameter.getBoardTitle());
			board.setBoardContents(parameter.getBoardContents());
			
			board = boardRepository.save(board);
			
			res.setSuccess("true");
			res.setMessage("저장 성공");
			res.setBoardId(board.getBoardId());
			res.setBoardTitle(board.getBoardTitle());
			res.setBoardContents(board.getBoardContents());
			res.setUserId(board.getUserId());
		} catch (Exception e) {
			e.printStackTrace();
			res.setSuccess("false");
			res.setMessage("저장 중 오류가 발생하였습니다.");

		}
		
		return res;
	}
	
	

}
