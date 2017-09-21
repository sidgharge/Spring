package com.bridgelabz.AutoDetection.dao;

import org.springframework.stereotype.Repository;

import com.bridgelabz.AutoDetection.model.Employee;

@Repository("employeeDao")
public class EmployeeDao implements Dao {


	public void save(Employee employee) {
		System.out.println("Employee saved: " + employee);		
	}

}
