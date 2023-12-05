package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class HttpSender implements ReadingSender {

	@Qualifier("humiditySensor")
	@Autowired
	private Sensor sensor;
	
	@Override
	public void send() {
		int reading = sensor.readValue();
		System.out.println(reading + " : Sending over Http");

	}

}
