package com.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotificationClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.notification");
		NotificationService service = (NotificationService) context.getBean("notificationService");
		service.sendSMS("98463");
        context.close();
	}

}
