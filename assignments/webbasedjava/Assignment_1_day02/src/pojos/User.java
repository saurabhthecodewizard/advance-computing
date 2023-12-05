package pojos;

import java.sql.Date;

public class User 
{
	private int id;
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date registrationDate;
	private String role;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getRole() {
		return role;
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
