package com.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.Dao;
import com.bridgelabz.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	Dao userDao;
	
	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void deleteUserById(int id) {
		userDao.deleteUserById(id);
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
}
