package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from the spring container
		ICoach trackCoach = context.getBean("trackCoach", ICoach.class);
		ICoach baseballCoach = context.getBean("baseballCoach", ICoach.class);
		ICoach cricketCoach = context.getBean("cricketCoach", ICoach.class);
		
		// call methods on the bean
		
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(((CricketCoach)cricketCoach).getTeam());
		System.out.println(((CricketCoach)cricketCoach).getEmailAddress());
		
		// close the context
		context.close();

	}

}
