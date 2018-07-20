package com.spring.annotations;

import org.springframework.stereotype.Component;

import com.springdemo.ICoach;

//Spring use that annotation when scan the class.
//This annotation would create corresponding bean like we did manually in config file.
//We can use @Component without specifying name, than class name used but with lower letter (tennisCoach)
@Component("myTennisCoach")
public class TennisCoach implements ICoach{

	@Override
	public String getDailyWorkout() {
		return "Tennis Coach | Daily Workout";
	}

	//Not relevant to this example
	@Override
	public String geyDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
