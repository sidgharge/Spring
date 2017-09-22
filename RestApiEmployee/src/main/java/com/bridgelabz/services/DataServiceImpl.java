package com.bridgelabz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.DataDao;
import com.bridgelabz.model.Employee;

public class DataServiceImpl implements DataServices {

	@Autowired
	DataDao dataDao;

	@Override
	public boolean addEntity(Employee employee) throws Exception {
		dataDao.addEntity(employee);
		return false;
	}

	@Override
	public Employee getEntityById(int id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
