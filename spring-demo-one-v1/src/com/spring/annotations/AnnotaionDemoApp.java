package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.ICoach;

public class AnnotaionDemoApp {

	public static void main(String[] args) {

		// read spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

		// get bean
		ICoach theCoach = context.getBean("myTennisCoach", ICoach.class);
		
		// call method
		System.out.println(theCoach.getDailyWorkout());

		// close context/factory.
		context.close();
	}

}
