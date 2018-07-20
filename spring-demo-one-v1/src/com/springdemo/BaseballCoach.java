package com.springdemo;

public class BaseballCoach implements ICoach{
	
	//Field for the service.
	private IFortuneService fortuneService;
	
	// Constructor Dependency Injection (DI)
	public BaseballCoach(IFortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 min on daily practice";
	}

	@Override
	public String geyDailyFortune() {
		//Use service.
		String s = this.fortuneService.getFortune();
		return s + "| Baseball Coach";
	}
	
	
}
