package com.spring.model;

public class Student {
	int stuid;
	String stuname;
	int mark;
	public Student() {
		
	}
	public Student(int stuid, String stuname, int mark) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.mark = mark;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", mark=" + mark + "]";
	}
	public void exams() {
		System.out.println("Student writing the exams...");
	}
	
	public void init() {
		System.out.println("Spring bean Intialized");
	}
	
	public void destroy() {
		System.out.println("Spring bean is destroyed");
	}
}
