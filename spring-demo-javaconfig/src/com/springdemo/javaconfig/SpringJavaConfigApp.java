package com.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

		// use bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the container
		context.close();
	}

}
