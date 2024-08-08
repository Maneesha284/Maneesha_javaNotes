package com.springcoredemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	private Department department;
	@Bean(name="dept")
	public Department department1() {
		Department dept = new Department();
		dept.setDeptId("345");
		this.department = dept;
		return dept;
	}
	
	@Bean(name="dept")
	//if we do'nt specifiy name attribute
	//this bean name is department2(whatever the method 
	//name is there)
	//if we specify attribute, the bean name is
	//the value is specified in the name attribute
	public Department department2() {
		Department dept = new Department();
		dept.setDeptId("123");
		this.department = dept;
		return dept;
	}
	
	@Bean
	public Employee employee() {
		//logic
		Employee emp = new Employee(department);
		return emp;
	}
	

}
