package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/resources/config.xml");
		
		Restaurant rs=(Restaurant) context.getBean("restaurantBean");
		rs.man();
	}
}
