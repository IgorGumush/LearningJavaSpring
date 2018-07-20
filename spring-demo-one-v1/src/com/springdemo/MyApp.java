package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICoach bCoach = new BaseballCoach();
		ICoach tCoach = new TrackCoach();
		
		System.out.println(tCoach.getDailyWorkout());
	}

}
