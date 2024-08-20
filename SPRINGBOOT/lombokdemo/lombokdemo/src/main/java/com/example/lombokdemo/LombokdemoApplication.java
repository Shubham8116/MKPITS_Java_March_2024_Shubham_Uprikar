package com.example.lombokdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokdemoApplication.class, args);
		Customer customer=new Customer(1,"new  colony","shubham");
		System.out.println(customer);
		Customer newcustomer=new Customer();
		newcustomer.setCust_id(4);
		newcustomer.setCust_name("shubham");
		System.out.println(newcustomer);
	}

}
