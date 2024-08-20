package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("ApplicationContext.xml");  
	      
	    Student student=(Student)context.getBean("s");  
	    student.displayDetails();
		
	}
	


}
