package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// App should be configurable - Spring Inversion of Control (IoC)
		// Give me object (Using spring object factory) - using configuration file.
		// The a 3 ways (XML / JAVA Annotations / Java Source Code)
		/* Spring container = Application Context */
		/* Spring Bean = Java object - retrieved for spring container */
		
		
		//load the spring configuration file.
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		//call methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context.
		context.close();

	}

}
