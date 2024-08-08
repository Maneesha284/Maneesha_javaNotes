package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customException.StduentNotFoundException;
import com.example.demo.dao.StudentDao;
import com.example.demo.student.Student;

@RestController
//@Controller
public class StudentRestController {
	@Autowired
	private StudentDao dao;
	
	@GetMapping("/std1")
	public List<Student> viewAll(){
		return dao.findAll();
	}
	
//	@GetMapping("/std2")
//	public Student findStudent(){
//		return dao.find(222);
//	}
	
//	@GetMapping("/std1/{no}")
//	public Student findStudent(@PathVariable int no) {
//		return dao.find(no);
//	}
	
	@GetMapping("/std1/{no}")
	public Student findStudent(@PathVariable int no) {
		Student std=dao.find(no);
		if(std==null)
			throw new StduentNotFoundException("Student not found: "+no);
		return std;
	}
}
