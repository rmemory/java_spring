package com.springdemo.services;

public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "This is your lucky day.";
	}

}
