package com.spring.annotations;

import org.springframework.stereotype.Component;

//Add as a Bean in Spring factory with id = 'happySevice' 
@Component
public class HappyService implements ISomeService {

	@Override
	public String getSomthingFromService() {
		return "Using SomeSevice";
	}

}
