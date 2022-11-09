package com.manjunath.service;

import java.util.List;

import com.manjunath.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee saveEmployee (Employee employee);

}
