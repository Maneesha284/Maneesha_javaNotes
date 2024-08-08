package com.multipleannotationconfigdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {
	
	@Bean
	public BeanX beanX() {
		return new BeanX();
	}

}
