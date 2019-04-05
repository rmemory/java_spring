package com.springdemo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springdemo.javaconfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public IFortuneService happyFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	public ICoach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
		
		return mySwimCoach;
	}
}
