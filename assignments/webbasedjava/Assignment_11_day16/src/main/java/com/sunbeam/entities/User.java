package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "users")
public class User {
	
	
	private int id;
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date registrationDate;
	private String role;
	public User() {
		super();
	}
	public User(int id, String name, String email, String password, double registrationAmount, Date registrationDate,
			String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.registrationDate = registrationDate;
		this.role = role;
	}
	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	@Column(name = "reg_amt")
	public Double getRegistrationAmount() {
		return registrationAmount;
	}
	@Column(name = "reg_date")
	@Temporal(TemporalType.DATE)
	public Date getRegistrationDate() {
		return registrationDate;
	}
	@Column(name = "role")
	public String getRole() {
		return role;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", registrationAmount=" + registrationAmount + ", registrationDate=" + registrationDate + ", role="
				+ role + "]";
	}
	
	
	

}
