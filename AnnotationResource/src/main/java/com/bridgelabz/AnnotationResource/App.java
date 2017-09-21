package com.bridgelabz.AnnotationResource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Application application = (Application) context.getBean("application");
		System.out.println(application);
		context.close();
		
	}
}
