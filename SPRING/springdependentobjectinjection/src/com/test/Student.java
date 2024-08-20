//Student bean
package com.test;

public class Student {
	private String name;
	private int marks;
	private Address adr;
	
	
	
	public Student() {
		super();
	}
	public Student(int marks) {
		super();
		this.marks = marks;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
	public Student(String name, int marks, Address adr) {
		super();
		this.name = name;
		this.marks = marks;
		this.adr = adr;
	}
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(marks);
		System.out.println(adr);
	}

}
