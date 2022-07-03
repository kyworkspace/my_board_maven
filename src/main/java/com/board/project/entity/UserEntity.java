package com.board.project.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.LAZY )
	@JoinColumn(name="user_id")
	private List<BoardEntity> boardList;
	
	

}
