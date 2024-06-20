package com.wipro.Practice;

public class Adminstrative extends Staff {
	private String admindepart;

	public String getAdmindepart() {
		return admindepart;
	}

	public void setAdmindepart(String admindepart) {
		this.admindepart = admindepart;
	}

	public Adminstrative(String name, int age, String contact, String admindepart) {
		super(name, age, contact);
		this.admindepart = admindepart;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Admin Department :"+admindepart);
	}
	
}
