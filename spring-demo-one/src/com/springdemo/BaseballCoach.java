package com.springdemo;

import com.springdemo.services.IFortuneService;

public class BaseballCoach implements ICoach {
	private IFortuneService fortuneService;
	
	public BaseballCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
