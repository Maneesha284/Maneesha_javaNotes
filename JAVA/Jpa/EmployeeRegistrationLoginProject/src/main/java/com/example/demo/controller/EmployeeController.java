package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.exception.EmployeeException;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/insert")
	public String saveEmployee(@RequestBody EmployeeEntity e) {  //Data accept from postman
		EmployeeEntity insert = service.insert(e);
		String msg="";
		if(insert!=null) {
			msg="Employee record added successfully";
		}
		else {
			msg="Employee record not added. Try again!";
		}
		return msg;
	}
	
	@GetMapping("/view")
	public List<EmployeeEntity> viewAll(){
		List<EmployeeEntity> viewAllRecords = service.viewAllRecords();
		return viewAllRecords;
	}
	
	@GetMapping("/find/{no}")
	public EmployeeEntity find(@PathVariable int no) {
		EmployeeEntity find = service.find(no);
		return find;
	}
	
	
	@PostMapping("/update")
	public String updateEmployee(@RequestBody EmployeeEntity e1) {  //Data accept from postman
		EmployeeEntity update = service.update(e1);
		String msg="";
		if(update!=null) {
			msg="Employee record updated successfully";
		}
		else {
			msg="Employee record not updated. Try again!";
		}
		return msg;
	}
	
	
	@GetMapping("/del/{no}")
	public String deleting(@PathVariable int no) throws EmployeeException {
		int count=service.deleteRecord(no);
		String msg="";
		if(count==1) {
			msg="Employee record is deleted successfully";
		}
		else {
			msg="Employee record is not deleted";
		}
		return msg;
	}
	
	
	@GetMapping("/login/{email}/{pswd}")
	public String check(@PathVariable String email,@PathVariable String pswd) {
		EmployeeEntity login = service.login(email, pswd);
		String msg="";
		if(login!=null) {
			msg="You are login successfully";
		}
		else {
			msg="you are failed to login. Try again!";
		}
		return msg;
	}
}
