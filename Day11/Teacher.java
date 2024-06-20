package com.wipro.Practice;

public class Teacher extends Staff {
	private String subj;

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}

	public Teacher(String name, int age, String contact, String subj) {
		super(name, age, contact);
		this.subj = subj;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Subject : "+subj);
	}
}
