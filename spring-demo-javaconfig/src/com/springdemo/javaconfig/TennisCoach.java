package com.springdemo.javaconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
//@Scope("singleton")
public class TennisCoach implements ICoach {
	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartup() {
		System.out.println("Startup method");
	}
	
	@PreDestroy
	public void doDestroy() {
		System.out.println("Destroy method");
	}
	
	
//	@Autowired
//	public void setFortuneService(IFortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
}
