package com.wipro.Practice;

public class SupportStaff extends Staff {
	private String role;
	private String dep;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String subj) {
		this.dep = dep;
	}
	
	public SupportStaff(String name, int age, String contact, String role, String dep) {
		super(name, age, contact);
		this.role = role;
		this.dep = dep;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("role : "+role+" Subject : "+dep);
	}
}
