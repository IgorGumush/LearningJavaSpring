package com.spring.annotations;

import org.springframework.stereotype.Component;

import com.springdemo.IFortuneService;

@Component
public class DatabaseService implements ISomeService {

	@Override
	public String getSomthingFromService() {
		return "Using DatabaseService";
	}

}
