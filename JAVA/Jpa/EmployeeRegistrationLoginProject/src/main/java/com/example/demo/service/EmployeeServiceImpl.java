package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.exception.EmployeeException;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	@Override
	public EmployeeEntity insert(EmployeeEntity e) {
		EmployeeEntity save1 = dao.save(e);
		return save1;
	}
	
	@Override
	public List<EmployeeEntity> viewAllRecords() {
		List<EmployeeEntity> find = dao.findAll();
		return find;
	}
	@Override
	public EmployeeEntity find(int num) {
		Optional<EmployeeEntity> findById = dao.findById(num);
		return findById.get();
	}
	
	@Override
	public EmployeeEntity update(EmployeeEntity e1) {
		EmployeeEntity save2 = dao.save(e1);
		return save2;
	}
	
	@Override
	public int deleteRecord(int num) {
		try {
			dao.deleteById(num);
		}
		catch(Exception e) {
			throw new EmployeeException("EmployeeException");
		}
		return 1;
	}
	
	
	@Override
	public EmployeeEntity login(String email, String pswd) {
		EmployeeEntity find = dao.findByEmailAndPswd(email, pswd);
		return find;
	}
	
	
}
