package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.ICoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get bean - 
		// Constructor should get ISomeService
		// Spring search for a class that Implements it and injects it to the constructor.
		ICoach theCoach = context.getBean("swimCoach", ICoach.class);
		
		// call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.geyDailyFortune());
		
		// close context/factory.
		context.close();
	}

}
