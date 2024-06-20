package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.model.Employee;
import com.spring.model.Person;
import com.spring.model.Address;
@Configuration
public class BeanConfiguration {
    @Bean(name="adr1")
    @Scope("prototype")
	public Address createAddress1() {
		return new Address("Theni",303, "Tamil Nadu",625579);
	}
	@Bean
	public Address createAddress2() {
		return new Address("Theni",302, "Tamil Nadu",625579);
	}
	
	@Bean
	public Employee createEmployee() {
		return new Employee();
	}
	@Bean
	public Person createPerson() {
		return new Person(999,"Aravinthan",createAddress2());
	}
}
