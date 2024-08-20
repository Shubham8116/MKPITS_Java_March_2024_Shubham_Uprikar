package com.test;

public class Student {
	private String name;
	private int marks;
	
	
	
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
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(marks);
	}

}
