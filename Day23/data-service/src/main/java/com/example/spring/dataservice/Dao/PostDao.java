package com.example.spring.dataservice.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.dataservice.model.Posts;

@Repository
public interface PostDao extends JpaRepository<Posts,Integer>{

}