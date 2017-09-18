package com.bridgelabz.DITest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class App {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("abc.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee) factory.getBean("employee");
		System.out.println(employee);
	}
}
