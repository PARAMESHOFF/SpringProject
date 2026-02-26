package com.kodnest.Springproject1;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int rollno = 28;
	String name = "parmesh";
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
