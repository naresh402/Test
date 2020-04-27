package com.oasys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.entity.EmployeeEntity;
import com.oasys.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

}
