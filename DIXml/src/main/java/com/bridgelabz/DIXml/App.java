package com.bridgelabz.DIXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Communication communication  = (Communication) context.getBean("communication");
		communication.communicate();
		context.close();
		
	}
}
