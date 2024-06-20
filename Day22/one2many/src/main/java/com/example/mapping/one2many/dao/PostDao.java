package com.example.mapping.one2many.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.one2many.model.Post;

@Repository
public interface PostDao extends JpaRepository<Post,Long> {

}
