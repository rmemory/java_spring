package com.springdemo;

import com.springdemo.services.IFortuneService;

public class CricketCoach implements ICoach {
	private IFortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// Setter called by applicationContext
	public void setFortuneServiceSetter(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
}
