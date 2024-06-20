package com.spring.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DeptConfigrations.class);
		DepartmentService service = context.getBean(DepartmentService.class);
		
		System.out.println(service.getDepartmentWork());
		System.out.println(service.getDepartmentLocation());
	}

}
