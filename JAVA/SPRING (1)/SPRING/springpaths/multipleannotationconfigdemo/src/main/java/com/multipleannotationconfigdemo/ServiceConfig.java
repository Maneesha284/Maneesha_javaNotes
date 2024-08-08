package com.multipleannotationconfigdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public BeanY beanY() {
		return new BeanY();
	}

}
