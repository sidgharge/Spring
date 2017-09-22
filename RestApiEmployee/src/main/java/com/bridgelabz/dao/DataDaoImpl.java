package com.bridgelabz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.model.Employee;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory factory;
	
	Session session = null;
	Transaction transcation = null;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		session = factory.openSession();
		transcation = session.beginTransaction();
		
		session.save(employee);
		
		transcation.commit();		
		session.close();
		return false;
	}

	@Override
	public Employee getEntityById(int id) throws Exception {
		session = factory.openSession();
		Employee employee = session.get(Employee.class, id);
		
		return employee;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> getEntityList() throws Exception {
		session = factory.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> list = (List<Employee>) session.createCriteria(Employee.class).list();
		return list;
	}

	@Override
	public boolean deleteEntity(int id) throws Exception {
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(id);
		session.delete(employee);
		transaction.commit();
		session.close();
		return false;
	}

}
