package com.board.project.entity;

import lombok.Data;


@Data
public class BaseDto {
	
	//boolean은 안되나?
	protected String success;
	protected String message;
	
	public BaseDto() {}

}
