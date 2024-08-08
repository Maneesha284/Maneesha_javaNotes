package com.springcoredemo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	/*//eager loading and singleton scope
	//since @Scope is not specified as "prototype"
	//and @Lazy is not specified
	@Bean
	public Student student() {
		return new Student();
	}*/
	
	/*//Lazy loading and the scope is singleton
	@Bean
	@Lazy
	public Student student() {
		return new Student();
	}*/
	
	//eager loading and scope is prototype
	@Bean
	@Scope("prototype")
	public Student student() {
		return new Student();
	}
}
