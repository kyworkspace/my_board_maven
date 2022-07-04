package com.board.project.entity;

import java.util.Date;

import lombok.Data;


@Data
public class BaseDto {
	
	//boolean은 안되나?
	protected String success;
	protected String message;
	protected boolean successFlag;
	
	protected Date insertDt;
	protected String insertUserId;
	protected Object data;
	
	
	public BaseDto() {}

}
