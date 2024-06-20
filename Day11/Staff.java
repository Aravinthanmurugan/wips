package com.wipro.Practice;

public class Staff {
	private String name;
	private int age;
	private String contact;
	public Staff(String name, int age, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	//get and set method 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void display() {
		System.out.println("Name : "+name+" Age : "+age+" \nAddress : "+contact);
	}
}
