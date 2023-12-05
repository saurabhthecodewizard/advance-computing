package com.sunbeam;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TemperatureSensor implements Sensor{
	
	@Override
	public int readValue() {
		Random r = new Random();
		return r.nextInt(20) + 10;
	}

}
