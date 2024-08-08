package com.springlifecycledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	/*//eager and singleton
	@Bean
	public Employee employee() {
		return new Employee();
	}*/
	
	//singleton and lazy
	/*@Bean
	@Lazy
	public Employee employee() {
		return new Employee();
	}*/
	
	@Bean(name="emp", initMethod="init")
	public Employee employee() {
		return new Employee();
	}
	
	/*//eager and singleton
	@Bean
	public Department department() {
		return new Department();
	}*/
	
	/*//lazy and singleton
	@Bean
	@Lazy
	public Department department() {
		return new Department();
	}*/
	
	
	@Bean(initMethod="init")
	public Department department() {
		return new Department();
	}
	
	

}
