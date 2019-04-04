package com.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean
//		ICoach theCoach = context.getBean("theTennisCoach", ICoach.class);
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

		// use bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the container
		context.close();
	}

}
