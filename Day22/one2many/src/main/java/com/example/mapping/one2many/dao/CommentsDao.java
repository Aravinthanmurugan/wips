package com.example.mapping.one2many.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.one2many.model.Comment;

@Repository
public interface CommentsDao extends JpaRepository<Comment ,Long> {

}
