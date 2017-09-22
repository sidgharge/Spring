package com.bridgelabz.HibernateSpringCrud;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.HibernateSpringCrud.dao.interfaces.MovieDao;
import com.bridgelabz.HibernateSpringCrud.model.Movie;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MovieDao movieDao = (MovieDao) context.getBean("movieDaoimpl");
		
		Movie movie = new Movie();
		movie.setTitle("Abc");
		movie.setReleaseYear(2017);
		movie.setDirector("Nileshbhau Karle");
		
		System.out.println("Movie created by id: " + movieDao.createMovie(movie));
		
		context.close();
	}
}
