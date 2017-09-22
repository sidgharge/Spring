package com.bridgelabz.HibernateSpringCrud.dao.implementations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bridgelabz.HibernateSpringCrud.dao.interfaces.MovieDao;
import com.bridgelabz.HibernateSpringCrud.model.Movie;

public class MovieDaoImpl implements MovieDao {

	SessionFactory factory;
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public int createMovie(Movie movie) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		int id = (int) session.save(movie);
		
		transaction.commit();
		session.close();
		
		return id;
	}

}
