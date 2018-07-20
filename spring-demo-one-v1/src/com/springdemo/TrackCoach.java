package com.springdemo;

public class TrackCoach implements ICoach {

	
	//Field for the service.
	private IFortuneService fortuneService;
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "TrackCoach - Run 5k";
	}

	@Override
	public String geyDailyFortune() {
		return fortuneService.getFortune() + " | Track Coach";
	}

}
