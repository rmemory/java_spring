package com.springdemo.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class SwimCoach implements ICoach {	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	private IFortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your stroke. " + email + " " + team;
	}
	
	public SwimCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}	
}
