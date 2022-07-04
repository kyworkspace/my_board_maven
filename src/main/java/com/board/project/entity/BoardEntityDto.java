package com.board.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BoardEntityDto extends BaseDto{
	
	private Long boardId;
	private String boardTitle;
	private String boardContents;

	@Data
	@Getter
	@Setter
	public static class saveCriteria extends BoardEntityDto{
		private Long boardId;
		private String boardTitle;
		private String boardContents;
		
	}
	
	@Data
	@Getter
	@Setter
	public static class Response extends BoardEntityDto{
		private Long boardId;
		private String boardTitle;
		private String boardContents;
		
	}
	

}
