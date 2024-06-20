package com.wipro.Practice;

public class SchoolManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher("Aravinthan",26, "Chennai, Tamilnadu", "Physics");
		Adminstrative admin=new Adminstrative("Subash", 38, "Chennai, TamilNadu", "Accountant");
		SupportStaff support=new SupportStaff("Malika", 30, "Chennai, TamilNadu", "Teacher", "Maths");
		System.out.println("Teacher Info: ");
		teacher.display();
		System.out.println();
		System.out.println("Adminstrative Office info: ");
		admin.display();
		System.out.println();
		System.out.println("Support Staff info:");
		support.display();
	}

}
