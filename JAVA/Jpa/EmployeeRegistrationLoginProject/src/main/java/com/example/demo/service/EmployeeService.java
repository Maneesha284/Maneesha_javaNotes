package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.exception.EmployeeException;

public interface EmployeeService {
	public EmployeeEntity insert(EmployeeEntity e);
	
	public List<EmployeeEntity> viewAllRecords();
	public EmployeeEntity find(int num);
	
	public EmployeeEntity update(EmployeeEntity e1);
	
	public int deleteRecord(int num) throws EmployeeException;
	
	
	public EmployeeEntity login(String email,String pswd);
	
	
	
}
