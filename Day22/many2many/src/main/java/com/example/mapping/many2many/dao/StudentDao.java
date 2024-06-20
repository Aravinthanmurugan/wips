package com.example.mapping.many2many.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.many2many.model.Student;

public interface StudentDao extends JpaRepository<Student,Long> {

}
