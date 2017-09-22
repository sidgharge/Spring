package com.bridgelabz.services;

import java.util.List;

import com.bridgelabz.model.Employee;

public interface DataServices {

	 public boolean addEntity(Employee employee) throws Exception;  
	 public Employee getEntityById(int id) throws Exception;  
	 public List<Employee> getEntityList() throws Exception;  
	 public boolean deleteEntity(int id) throws Exception;
}
