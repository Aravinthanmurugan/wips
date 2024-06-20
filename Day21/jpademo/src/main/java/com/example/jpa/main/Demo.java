package com.example.jpa.main;

import java.util.List;

import com.example.jpa.Dao.StudentDaoImpl;
import com.example.jpa.models.Student;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDaoImpl dao = new StudentDaoImpl();
		Student student = new Student("Aravinthan","murugan","aravinthanmurugan2001@gmail.com");
		
       dao.insertEntity(student);
      // dao.findEntity(2);
       // dao.updateEntity();
       // dao.removeEntity(2);
		List<Student> students = dao.getAll();
        students.forEach(System.out::println);
        System.out.println("All operations done");

	}

}