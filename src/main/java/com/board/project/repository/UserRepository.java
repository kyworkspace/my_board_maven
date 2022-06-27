package com.board.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.project.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	UserEntity findByUserId(String userId);
	

}
