package com.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	@Autowired
	private SMSGateway smsGateway;
	
	public void sendSMS(String msg) {
		smsGateway.send(msg);
	}
}
