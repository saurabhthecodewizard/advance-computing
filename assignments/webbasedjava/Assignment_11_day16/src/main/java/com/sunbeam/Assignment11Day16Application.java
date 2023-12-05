package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.entities.User;
import com.sunbeam.services.UserServiceImpl;

@SpringBootApplication
public class Assignment11Day16Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Assignment11Day16Application.class, args);
	}
	
	@Autowired
	private UserServiceImpl userService;

	@Override
	public void run(String... args) throws Exception {
		
		//all users
		List<User> userList = userService.findAllUsers();
		userList.forEach(System.out::println);
		
		//user by id
		System.out.println(userService.findUserById(2));
		
		//add user
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		User u = new User(10, "john", "john@gmail.com", "4321", 2100, sdf.parse("2020-06-09"), "customer");
		System.out.println(userService.saveUser(u));
		
		//update user
		u = userService.findUserById(10);
		u.setEmail("john123@gmail.com");
		u.setPassword("8765");
		System.out.println(userService.saveUser(u));
		
		
		//delete user
		userService.deleteUserById(10);
		
	}

}
