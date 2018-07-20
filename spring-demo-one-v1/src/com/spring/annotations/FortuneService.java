package com.spring.annotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FortuneService implements ISomeService{
	
	String fortunes[];
	
	// The flow is:
	// 1. Create Instance;
	// 2. Inject Dependencies
	// 3. Set values (@value)
	// Hence making assignment in the constructor would result NULL initialization.
	
	@Value("${foo.fortuneA}")
	String a;
	
	@Value("${foo.fortuneB}")
	String b;
	
	@Value("${foo.fortuneC}")
	String c;
	
	
	public FortuneService() {
		System.out.println("run FortuneService constructor");
		fortunes = new String[3];
		
	}
	
	@Override
	public String getSomthingFromService() {
		Random rand = new Random();
		fortunes[0] = a;
		fortunes[1] = b;
		fortunes[2] = c;
		
		int  n = rand.nextInt(3);
		return fortunes[n];
	}

	
}
