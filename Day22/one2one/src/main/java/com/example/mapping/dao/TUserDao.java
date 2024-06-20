package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.TUser;
@Repository
public interface TUserDao extends JpaRepository<TUser,Long> {

}
