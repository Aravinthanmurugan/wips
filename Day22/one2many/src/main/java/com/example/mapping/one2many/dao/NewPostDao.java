package com.example.mapping.one2many.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.one2many.model.NewPost;

@Repository
public interface NewPostDao extends JpaRepository<NewPost,Long>{

}
