package com.springdemo;

public class CricketCoach implements ICoach {

	//Field for the service.
	private IFortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach constructor called");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Cricket Coack | Daily workuot do somthing";
	}

	@Override
	public String geyDailyFortune() {
		return fortuneService.getFortune() + "| CricketCoach";
	}

	//Setter injection for Spring
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Using the setter injection | Cricket Coach");
		this.fortuneService = fortuneService;
	}

	
}
