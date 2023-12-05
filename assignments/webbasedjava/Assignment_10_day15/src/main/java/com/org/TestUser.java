package com.org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestUser {

	public static void main(String[] args) {
		
		hibernateSimplified();	

	}
	
	public static void hibernateSimplified() {
		
		System.out.println("Hello, hibernate");
		
		UserDaoImpl dao = new UserDaoImpl();
		
		
		//find by id
		User user = dao.findById(2);
		System.out.println(user+"\n");
		
		//add a user
		//int id, String name, String email, String password, Double registrationAmount, Date registrationDate, String role
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			User u = new User(6, "john", "john@gmail.com", "1234", 1300, sdf.parse("2018-09-23"), "customer");
			dao.save(u);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//all users
		List<User> userList = dao.findAll();
		userList.forEach(System.out::println);
		
		//update a user
		User u = dao.findById(6);
		System.out.println(u);
		u.setPassword("4321");
		u.setRegistrationAmount(2100);
		dao.update(u);
		u = dao.findById(6);
		System.out.println(u);
		
		//delete a user
		User u2 = dao.findById(6);
		dao.deleteById(6);
		userList = dao.findAll();
		userList.forEach(System.out::println);
		
		
	}

}
