package com.bridgelabz.AutowireByConstructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Performer performer = (Performer) context.getBean("performer");
		System.out.println(performer);
		context.close();
	}
	
}
