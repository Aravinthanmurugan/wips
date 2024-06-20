package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedConfigExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EntityConfigurations.class);

	Book book = context.getBean(Book.class);
	Book book1 = (Book) context.getBean("b");
	
	Course course = context.getBean(Course.class);
	Course course1 = (Course) context.getBean("c");
	}

}
