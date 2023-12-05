package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoapSender implements ReadingSender {

	@Qualifier("humiditySensor")
	@Autowired
	private Sensor sensor;
	
	@Override
	public void send() {
		int reading = sensor.readValue();
		System.out.println(reading + " : Sending over Soap");

	}

}
