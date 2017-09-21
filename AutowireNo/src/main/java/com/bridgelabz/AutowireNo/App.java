package com.bridgelabz.AutowireNo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Driver driver = (Driver) context.getBean("driver");
		System.out.println(driver);
		context.close();
		
	}
}
