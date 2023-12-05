package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.User;

@Transactional
@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDao dao;
	
	public User findUserById(int id) {
		Optional<User> u = dao.findById(id);
		return u.orElse(null);
	}
	
	public List<User> findAllUsers() {
		return dao.findAll();
	}
	
	public User saveUser(User u) {
		return dao.save(u);
	}
	
	public void deleteUserById(int id) {
		dao.deleteById(id);
	}

}
