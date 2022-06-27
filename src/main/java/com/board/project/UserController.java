package com.board.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.project.entity.UserEntityDto;
import com.board.project.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public UserEntityDto UserLogin(@RequestBody UserEntityDto user) {
		System.out.println("사용자 로그인");
		return userService.userLogin(user);
	}
	@PostMapping("/register")
	public UserEntityDto UserRegister(@RequestBody UserEntityDto parameter) {
		System.out.println("사용자 등록");
		UserEntityDto res = userService.register(parameter);
		System.out.println(res.getSuccess()+ " : "+res.getMessage());
		return res;
	}

}
