package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.UserProfile;
@Repository
public interface UserProfileDao extends JpaRepository<UserProfile, Long> {

}
