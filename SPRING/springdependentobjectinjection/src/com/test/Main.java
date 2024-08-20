package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	      System.out.println("Calling 2 paramaterized constructor having type int and String");
	    Student student=(Student)context.getBean("s");  
	    student.displayDetails();
	    
	    System.out.println("Calling single paramater constructor having type int");
	    Student student1=(Student)context.getBean("s1");  
	    student1.displayDetails();
	    
	    System.out.println("Calling single paramater constructor having type String");
	    Student student2=(Student)context.getBean("s2");  
	    student2.displayDetails();
	    
	    System.out.println("Calling 3 parametrized constructor having type int, String and object");
	    Student student3=(Student)context.getBean("s4");  
	    student3.displayDetails();
	    
	    
		
	}
	


}
