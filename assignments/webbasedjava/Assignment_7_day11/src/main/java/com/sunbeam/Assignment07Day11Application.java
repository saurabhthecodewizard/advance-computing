package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment07Day11Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Assignment07Day11Application.class, args);
	}
	
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private ReadingSender restSender;
	
	@Autowired
	@Qualifier("soapSender")
	private ReadingSender soapSender;

	@Override
	public void run(String... args) throws Exception {
		
		ReadingSender readingSender = ctx.getBean(ReadingSender.class);
		System.out.println("Reading Sender(Primary)");
		readingSender.send();//getting Http
		
		ReadingSender tcpSender = (ReadingSender) ctx.getBean("tcpSender");
		System.out.println("Reading Sender(Qualifier)");
		tcpSender.send();
		
		System.out.println("Reading Sender(only Autowired in main)");
		restSender.send();//getting Http
		
		System.out.println("Reading Sender(Autowired and Qualifier in main)");
		soapSender.send();
				
	}

}
