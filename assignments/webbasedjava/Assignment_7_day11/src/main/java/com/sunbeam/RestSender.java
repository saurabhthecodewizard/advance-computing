package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestSender implements ReadingSender {

	@Autowired
	private Sensor sensor;
	
	@Override
	public void send() {
		int reading = sensor.readValue();
		System.out.println(reading + " : Sending over Rest");
	}

}
