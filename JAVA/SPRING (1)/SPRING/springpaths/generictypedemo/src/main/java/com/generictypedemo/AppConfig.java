package com.generictypedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public DataProcessor<String> dataProcessor1() {
		return new DataProcessor<String>();
	}
	
	@Bean
	public DataProcessor<Integer> dataProcessor2() {
		return new DataProcessor<Integer>();
	}

}
