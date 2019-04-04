package com.springdemo.javaconfig;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {
	private String[] fortuneArray = {
			"This is your lucky day.",
			"This is your unlucky day.",
			"This is a could go either way day"
	};
	private Random rand = new Random();

	@Override
	public String getFortune() {
		return fortuneArray[rand.nextInt(3)];
	}

}
