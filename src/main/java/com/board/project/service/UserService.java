package com.board.project.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.project.entity.UserEntity;
import com.board.project.entity.UserEntityDto;
import com.board.project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public UserEntityDto userLogin(UserEntityDto parameter) {
		
		UserEntity user = userRepository.findByUserId(parameter.getUserId());
		
		UserEntityDto resultSet = new UserEntityDto();
		if(user == null) {
			//아이디가 없음
			resultSet.setSuccess("false");
			resultSet.setMessage("가입되지 않은 아이디 입니다.");
		}else if(!parameter.getUserPassword().equals(user.getUserPassword())) {
			//비밀번호 비교 틀림
			resultSet.setSuccess("false");
			resultSet.setMessage("비밀번호가 맞지 않습니다.");
		}else {
			resultSet.setSuccess("true");
			resultSet.setMessage("어서오세요. "+user.getUserId()+"님");
			resultSet.setUserId(user.getUserId());
		}
		return resultSet;
	}

	public UserEntityDto register(UserEntityDto parameter) {
		
		
		UserEntity registeredUser = userRepository.findByUserId(parameter.getUserId());
		UserEntityDto resultSet = new UserEntityDto();
		System.out.println("registeredUser : "+registeredUser);
		if(registeredUser == null) {
			UserEntity user = new UserEntity();
			user.setUserId(parameter.getUserId());
			user.setUserPassword(parameter.getUserPassword());
			UserEntity saveduser = userRepository.save(user);
			
			if(saveduser == null) {
				resultSet.setSuccess("false");
				resultSet.setMessage("사용자 등록에 실패하였습니다.");;
			}else {
				resultSet.setSuccess("true");
				resultSet.setMessage("사용자가 등록되었습니다.");
			}
		}else {
			resultSet.setSuccess("false");
			resultSet.setMessage("이미 등록된 아이디 입니다.");
		}
		return resultSet;
	}

}
