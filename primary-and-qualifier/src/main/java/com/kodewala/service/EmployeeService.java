package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.beans.Employee;

@Component
public class EmployeeService {
	
	@Autowired
	@Qualifier("emp1")
	private Employee employee;
	
	public void displayEmpDetail() {
		employee.display();
	}
}
