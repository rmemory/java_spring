package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		ICoach theCoach = context.getBean("trackCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("trackCoach", ICoach.class);
		
		// The result will depend on the scope of the trackCoach bean in beanScope-applicationContext.xml
		boolean result = theCoach == alphaCoach;
		
		System.out.println("The coach objects are " + (result ? "the same." : "not the same"));
		
		context.close();
	}

}
