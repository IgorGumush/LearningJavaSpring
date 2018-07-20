package com.springdemo;

public class CricketCoach implements ICoach {

	//Field for the service.
	private IFortuneService fortuneService;
	
	// Private filed for Literal Injection
	private String email;
	private String team;
	
	public String getEmail() {
		System.out.println("CricketCoach getEmail called");
		return email;
	}

	public String getTeam() {
		System.out.println("CricketCoach getTeam called");
		return team;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach setEmail called");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach setTeam called");
		this.team = team;
	}

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
	
	private void doMySturtupStuff() {
		System.out.println("Called doMySturtupStuff | Cricket Coach");
	}
	
	private void doMyCleanStuff() {
		System.out.println("Called doMyCleanStuff | Cricket Coach");
	}
	
}
