package com.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements ICoach {
	@Autowired
	@Qualifier("defaultFortuneService")
	private IFortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach (IFortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortuneService(IFortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void myCustomMethod(int myInt) {
//		System.out.println("myCustomMethod has been called");
//	}

}
