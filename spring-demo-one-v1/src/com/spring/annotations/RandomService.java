package com.spring.annotations;

import org.springframework.stereotype.Component;

import com.springdemo.IFortuneService;

@Component
public class RandomService implements ISomeService {

	@Override
	public String getSomthingFromService() {
		return "Using Random Sevice";
	}

}
