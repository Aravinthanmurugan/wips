package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdemo.controller.Employee;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		 Employee emp = context.getBean(Employee.class);
		 System.out.println(emp);
	}

}
