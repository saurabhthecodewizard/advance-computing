package com.sunbeam;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HumiditySensor implements Sensor {
	
	@Override
	public int readValue() {
		Random r = new Random();
		return r.nextInt(60) + 40;
	}

}
