package com.springlifecycledemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee implements InitializingBean, BeanNameAware {
	
	public Employee() {
		System.out.println("In employee constructor");
	}
	
	@PostConstruct
	public void afterConstruct() {
		System.out.println("in after construct employee");
	}
	
	private String empId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	private String empName;
	
	@Autowired
	private Department department;
	public Department getDepartment() {
		return department;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in afterPropertiesSet method employee");
		
	}
	
	public void init() {
		System.out.println("in init method in employee");
	}

	//this method is part of BeanName Aware interface
	
	@Override
	public void setBeanName(String name) {
		System.out.println("the name of the bean is "+name);
		
	}

}
