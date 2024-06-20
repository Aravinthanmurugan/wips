package com.spring.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fire")
@Primary
public class DepartmentImpl1 implements Department {

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "It's a Fire Work";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Locate at Chennai.....";
	}

}
