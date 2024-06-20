package com.spring.model;

public class Address {
	String city;
	int doorno;
	String state;
	int pincode;
	public Address() {
		
	}
	public Address(String city, int doorno, String state, int pincode) {
		super();
		this.city = city;
		this.doorno = doorno;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", doorno=" + doorno + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
