package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springdemo.ICoach;

//Spring use that annotation when scan the class.
//This annotation would create corresponding bean like we did manually in config file.
//We can use @Component without specifying name, than class name used but with lower letter (tennisCoach)
@Component("myTennisCoach")
public class TennisCoach implements ICoach{
	
	// Spring going to scan for a component that implements ISomeService 
	// Spring understands that it should set this value even there is no setter
	// If we have more that one it must be annotated so container would know which to use. "NoUniqueBeanException"
	// We'll specify using "@Qualifier" annotation.
	/** Done using reflection **/
	@Autowired
	@Qualifier("fortuneService")
	private ISomeService someService; 
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public TennisCoach() {
		System.out.println("Default TennisCoach called");
	}
	

	//@Autowired
	//public TennisCoach(ISomeService someService) {
	//	this.someService = someService;
	//}
	
	/*
	@Autowired
	public void setSomeService(ISomeService someService) {
		System.out.println("Setting autowired someService in TennisCoach Class");
		this.someService = someService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach | Daily Workout";
	}

	@Override
	public String geyDailyFortune() {
		// use the service
		String s = this.someService.getSomthingFromService();
		return s + " | used by TennisCoach" + "\n email: " + this.email ;
	}

}
