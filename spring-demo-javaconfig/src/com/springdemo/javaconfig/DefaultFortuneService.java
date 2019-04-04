package com.springdemo.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class DefaultFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "This is a default fortune";
	}

}
