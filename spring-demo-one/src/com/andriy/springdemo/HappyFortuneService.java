package com.andriy.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private String[] fortunes = { 
			"A body makes his own luck, be it good or bad.",
			"Change yourself and fortune will change.",
			"Good things come when you least expect them. "
	};
	
	private Random random = new Random();
    
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
