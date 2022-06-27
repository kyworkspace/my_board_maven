package com.board.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserEntityDto extends BaseDto{
	private String userId;
	private String userPassword;
	

}
