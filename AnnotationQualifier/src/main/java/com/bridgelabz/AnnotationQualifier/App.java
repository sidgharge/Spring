package com.bridgelabz.AnnotationQualifier;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
		context.close();

	}
}
