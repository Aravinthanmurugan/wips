package com.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int empid;
	String ename;
	String edept;
	public Employee() {
		
	}
	public Employee(int empid, String ename, String edept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.edept = edept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", edept=" + edept + "]";
	}
	
}
