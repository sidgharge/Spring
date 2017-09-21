package com.bridgelabz.AutoDetection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.AutoDetection.model.Employee;
import com.bridgelabz.AutoDetection.service.IEmployeeService;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		IEmployeeService employeeService = (IEmployeeService) context.getBean("employeeService");
		Employee employee = new Employee();
		employee.setName("Sid");
		employeeService.registerEmployee(employee);
		context.close();

	}
}
