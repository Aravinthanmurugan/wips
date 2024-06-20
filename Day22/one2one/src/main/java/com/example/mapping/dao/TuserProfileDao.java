package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.TUserProfile;
@Repository
public interface TuserProfileDao extends JpaRepository<TUserProfile,Long> {

}
