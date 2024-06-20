package com.spring.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.model.Employee;
import com.spring.model.Person;
import com.spring.model.Address;

public class javaBasedConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Person p = context.getBean(Person.class);
		System.out.println(p);
		
	//	Address a1= (Address) context.getBean(Address.class);
		Address a2= (Address) context.getBean("adr1");
		//System.out.println(a1);
		System.out.println(a2.hashCode());
		
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
	}

}
