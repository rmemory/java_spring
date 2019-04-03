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
	
	// bean init method
	public void doMyStartupStuff() {
		System.out.println("Startup method");
	}
	
	// bean destroy method (only called on singletons apparently)
	public void doMyShutdownStuff() {
		System.out.println("Shutdown method");
	}
}
