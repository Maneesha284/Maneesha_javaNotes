package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;
@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {
	
	public EmployeeEntity findByEmailAndPswd(String email,String pswd);

}
