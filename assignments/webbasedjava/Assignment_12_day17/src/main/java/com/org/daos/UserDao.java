package com.org.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);

}
