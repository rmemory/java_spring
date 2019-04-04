package com.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements ICoach {
	private IFortuneService fortuneService;
	
	@Autowired
	public TennisCoach (IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
