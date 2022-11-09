package com.manjunath.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manjunath.model.Employee;
import com.manjunath.service.EmployeeService;

//@Controller
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	

	
	//@RequestMapping(value="/employees", method=RequestMethod.GET)
	//@ResponseBody
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return eService.getEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public String getEmployee(@PathVariable Long id) {
		return " Fetching the employee details for the id"+" "+id;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
		System.out.println("update"+id);
		return employee;
	}
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eService.saveEmployee(employee);
	}
	
	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam Long id) {
		return "deleting the employees details of id "+" "+id;
	}
}


