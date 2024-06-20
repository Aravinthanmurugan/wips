
package com.example.jpa.Dao;

import java.util.List;

import com.example.jpa.models.Student;

public interface StudentDao {
	
	public void insertEntity(Student student);
	public void findEntity(int id);
	public void updateEntity();
	public List<Student> getAll();
	public void removeEntity(int id);

}
