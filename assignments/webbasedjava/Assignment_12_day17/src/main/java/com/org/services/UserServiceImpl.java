package com.org.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.org.daos.UserDao;
import com.org.entities.User;

@Service
@Transactional
public class UserServiceImpl {
	
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public User authenticateUser(String email, String password) {
		User user = userDao.findByEmail(email);
		if(user != null && user.getPassword().equals(password))
			return user;
		return null;
	}

}
