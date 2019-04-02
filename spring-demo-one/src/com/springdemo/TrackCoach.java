package com.springdemo;

import com.springdemo.services.IFortuneService;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;
	
	public TrackCoach( ) {
		super();
	}
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
