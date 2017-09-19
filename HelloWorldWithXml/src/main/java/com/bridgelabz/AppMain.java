package com.bridgelabz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		
		bean.sayHello("Sid");
		
		context.close();

	}

}
