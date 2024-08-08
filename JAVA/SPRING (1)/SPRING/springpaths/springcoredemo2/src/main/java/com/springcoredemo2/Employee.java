package com.springcoredemo2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	private Department mydepartment;
	
	@Autowired
	public Employee(Department dept) {
		this.mydepartment = dept;
	}
	
	public Employee() {
		
	}

	public Department getDepartment() {
		return mydepartment;
	}
	
	
}
	
