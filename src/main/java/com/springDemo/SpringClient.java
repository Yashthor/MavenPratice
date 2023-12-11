package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
				("BeansConfig.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		context.close();
		
	}

}
