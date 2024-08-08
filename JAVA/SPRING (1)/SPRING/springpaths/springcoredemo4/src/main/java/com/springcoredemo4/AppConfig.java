package com.springcoredemo4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcoredemo4")
@ComponentScan
public class AppConfig {
	
	@Bean
	public Organization organization() {
		return new Organization();
	}

}
