package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.User;
@Repository
public interface UserDao extends JpaRepository<User,Long> {

}
