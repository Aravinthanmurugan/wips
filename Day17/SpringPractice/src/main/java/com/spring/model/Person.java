package com.spring.model;

public class Person {
	int pid;
	String pname;
	Address address;
	public Person() {
		
	}
	public Person(int pid, String pname, Address address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + "]";
	}
	
}
