package com.spring.annotations;

public class SadService implements ISomeService {

	@Override
	public String getSomthingFromService() {
		return "do some sad service thing";
	}

}
