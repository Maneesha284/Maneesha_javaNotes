package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.student.Student;

@Component  // Spring to automatically detect our custom beans
public class StudentDao {
	private static List<Student> list= new ArrayList<Student>();
	static {
			list.add(new Student(111,"anu","guntur"));
			list.add(new Student(222,"kavya","hyd"));
			list.add(new Student(333,"janu","vizag"));
			list.add(new Student(444,"kkd","hyd"));
	}
	public List<Student> findAll(){
		return list;
	}
	
	public Student find(int sno) {
		for(Student std:list) {
			if(sno==std.getSno())
				return std;
		}
		return null;
	}
}
