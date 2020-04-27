package com.oasys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.entity.EmployeeEntity;
import com.oasys.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public EmployeeEntity create( @RequestBody EmployeeEntity employeeentity) {
		
		return employeeService.addEmployee(employeeentity);
	}

}
