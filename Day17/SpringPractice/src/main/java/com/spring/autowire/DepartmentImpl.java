package com.spring.autowire;

import org.springframework.stereotype.Component;

@Component("crime")
public class DepartmentImpl implements Department {

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "It's Murder ";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Locate in chennai";
	}

}
