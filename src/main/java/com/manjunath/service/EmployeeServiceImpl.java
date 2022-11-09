package com.manjunath.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manjunath.model.Employee;
import com.manjunath.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepoistary;
	


	@Override
	public List<Employee> getEmployees() {
		
		return eRepoistary.findAll();
		
		
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		
		
		return eRepoistary.save(employee);
	}

}
