package com.board.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="board")
public class BoardEntity {
	
	@Id
	@Column(name="board_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long boardId;
	
	@Column(name="board_title")
	private String boardTitle;
	
	@Column(name="board_contents")
	private String boardContents;
	
	@Column(name="user_id")
	private String userId;

}
