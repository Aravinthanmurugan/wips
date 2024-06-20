package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component("b")
public class Book {
	int bon;
	String author;
	String name;
	public Book() {
		
	}
	public Book(int bon, String author, String name) {
		super();
		this.bon = bon;
		this.author = author;
		this.name = name;
	}
	public int getBon() {
		return bon;
	}
	public void setBon(int bon) {
		this.bon = bon;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [bon=" + bon + ", author=" + author + ", name=" + name + "]";
	}
	
}
