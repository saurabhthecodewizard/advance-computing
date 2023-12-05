package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public AccountImpl acc() {
		AccountImpl a = new AccountImpl(101, "Saving", 10000);
		return a;
	}
	
	@Bean
	public Person p1() {
		Person p = new PersonImpl();
		p.setName("sam");
		p.setAge(22);
		p.setEmail("sam@gmail.com");
		
		return p;
	}
	
	@Bean
	public Person p2() {
		return new PersonImpl("dean", 27, "dean@gmail.com");
	}
	
	@Bean
	public ConsoleLoggerImpl consoleLogger() {
		return new ConsoleLoggerImpl();
	}

	@Bean
	public FileLoggerImpl fileLogger() {
		return new FileLoggerImpl();
	}
}
