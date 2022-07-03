package com.board.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.project.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{
}
