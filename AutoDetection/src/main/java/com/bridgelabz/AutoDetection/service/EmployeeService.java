package com.bridgelabz.AutoDetection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.AutoDetection.dao.EmployeeDao;
import com.bridgelabz.AutoDetection.model.Employee;

@Service("employeeService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	DateService dateService;
	
	@Autowired
	EmployeeDao employeeDao;
	
	public void registerEmployee(Employee employee) {
		
		employee.setAssessmentDate(dateService.getAssessmentDate());
		employeeDao.save(employee);
		
	}

}
