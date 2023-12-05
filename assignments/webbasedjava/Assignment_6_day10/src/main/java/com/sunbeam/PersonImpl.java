package com.sunbeam;

public class PersonImpl implements Person {
	
	private String name;
	private int age;
	private String email;
	
	public PersonImpl() {
		
	}
	
	public PersonImpl(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public void setName(String name) {
		this.name=name;

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setAge(int age) {
		this.age=age;

	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setEmail(String email) {
		this.email=email;

	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "PersonImpl [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	

}
