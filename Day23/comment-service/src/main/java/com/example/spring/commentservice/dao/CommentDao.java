package com.example.spring.commentservice.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.commentservice.model.Comments;

public interface CommentDao extends JpaRepository<Comments,Integer>{
	
	public List<Comments> findByPid(int pid);

}