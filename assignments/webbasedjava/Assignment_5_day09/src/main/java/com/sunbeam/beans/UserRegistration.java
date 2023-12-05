package com.sunbeam.beans;

import java.sql.Date;

import com.sunbeam.daos.RegistrationDaoImpl;
import com.sunbeam.pojos.User;

public class UserRegistration {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date date;
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(String registrationAmount) {
		this.registrationAmount = Double.parseDouble(registrationAmount);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = Date.valueOf(date);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void addUser()
	{
		try(RegistrationDaoImpl dao = new RegistrationDaoImpl())
		{
			this.user = new User();
			this.user.setName(this.name);
			this.user.setEmail(this.email);
			this.user.setPassword(this.password);
			this.user.setRegAmount(this.registrationAmount);
			this.user.setRegDate(this.date);
			
			dao.addNewCustomer(this.user);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
