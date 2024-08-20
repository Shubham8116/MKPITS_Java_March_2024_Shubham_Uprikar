package com.test;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private String name;
	private int marks;
	private String friends[];
	private List<String> subjects;
	private Map<String,String> edu_details;
	
	
	
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
	
	
	public Student(String name, int marks, List<String> subjects,Map<String,String> edu_details,String friends[]) {
		super();
		this.name = name;
		this.marks = marks;
		this.subjects = subjects;
		this.edu_details=edu_details;
		this.friends=friends;
	}
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(marks);
		//System.out.println(subjects);
//		 Set<Entry<String,String>> entrieSet=edu_details.entrySet();
//		 Iterator iterator=entrieSet.iterator();
//		 while(iterator.hasNext())
//		 {
//			 Entry<String,String> entry=(Entry)iterator.next();
//			 System.out.println(entry.getKey()+" " +entry.getValue());
//		 }

		System.out.println(edu_details);
		Iterator<Map.Entry<String,String>> itr=edu_details.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println(friends.toString());
	}

}
