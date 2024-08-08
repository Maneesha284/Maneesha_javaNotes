package com.springcoredemo5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean("dept1")
	public Department department() {
		Department dept = new Department();
		dept.setDeptId("1");
		return dept;
	}
	
	@Bean("dept1")
	@Primary
	public Department department1() {
		Department dept = new Department();
		dept.setDeptId("2");
		return dept;
	}

}
