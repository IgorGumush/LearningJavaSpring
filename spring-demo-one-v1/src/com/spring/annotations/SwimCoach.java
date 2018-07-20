package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

import com.springdemo.ICoach;

public class SwimCoach implements ICoach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private ISomeService someService;
	
	public SwimCoach(ISomeService someService) {
		this.someService = someService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "GO to Swim!";
	}

	@Override
	public String geyDailyFortune() {
		return someService.getSomthingFromService() + " | Swim Coach \n Email " + this.email;
	}

}
