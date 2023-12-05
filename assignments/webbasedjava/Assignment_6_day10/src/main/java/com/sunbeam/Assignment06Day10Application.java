package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment06Day10Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Assignment06Day10Application.class, args);
	}
	
	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		Account acc = (Account) ctx.getBean("acc");
		Logger consoleLogger = (Logger) ctx.getBean("consoleLogger");
		Logger fileLogger = (Logger) ctx.getBean("fileLogger");
		Person p1 = (Person) ctx.getBean("p1");
		Person p2 = (Person) ctx.getBean("p2");
		
		acc.setLogger(consoleLogger);
		acc.setAccHolder(p2);
		
		System.out.println("ACC " + acc);
		acc.deposit(3000);
		System.out.println("ACC " + acc);
		
		System.out.println(acc.toString());
	}
	
}
