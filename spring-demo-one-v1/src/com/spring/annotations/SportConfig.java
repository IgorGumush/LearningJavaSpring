package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springdemo.ICoach;


/*** NO XML IS BEENG USED ***/
// @Configuration - Empty configuration
// @ComponentScan - Which package to scan
// @PropertySourse - File with properties

@Configuration
//@ComponentScan("com.spring.annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for sad service
	// function name is the bean ID
	@Bean
	public ISomeService sadService() {
		return new SadService();
	}
	
	// Define bean for SwimCoach
	// Injecting the service to the class
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadService());
	}
	
	
}
