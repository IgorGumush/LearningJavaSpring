package com.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//App should be configurable - Spring Inversion of Control (IoC)
		//Give me object (Using spring object factory) - using configuration file.
		// The a 3 ways (XML / JAVA Annotations / Java Source Code)
		/* Spring container = Application Context */
		
		IFortuneService fortuneService = new HappyFortuneService();
		
		ICoach bCoach = new BaseballCoach(fortuneService);
		ICoach tCoach = new TrackCoach(fortuneService);
		
		System.out.println(tCoach.getDailyWorkout());
		
	}

}
