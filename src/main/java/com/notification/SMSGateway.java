package com.notification;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {
	
	public void send(String msg) {
		System.out.println("your OTP is: " + msg);
	}

}
