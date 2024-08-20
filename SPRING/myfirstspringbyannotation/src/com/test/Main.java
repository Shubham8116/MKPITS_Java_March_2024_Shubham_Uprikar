package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context =   
			    new AnnotationConfigApplicationContext(AppConfig.class);  
	      
	    Student student=(Student)context.getBean(Student.class);
	    student.displayDetails();
	    
	}
	


}
