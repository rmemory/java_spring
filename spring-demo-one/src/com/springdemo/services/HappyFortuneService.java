package com.springdemo.services;

import java.util.Random;

public class HappyFortuneService implements IFortuneService {
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
