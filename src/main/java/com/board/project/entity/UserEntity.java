package com.board.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="user")
public class UserEntity {
	
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_password")
	private String userPassword;
	

}
