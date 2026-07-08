package com.kodewala.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kodewala.bean")
public class SpringConfig {
	
//	@Bean("add")
//	public Address createAddress() {
//		
//			Address address = new Address("nimiya", "byepass road", "daltonganj", "Jharkhand");
//			
//			return address;
//	}
	
//	@Bean("emp")
//	public Employee createEmployee() {
//		Employee emp = new Employee("Abhishek", "Ranjan", createAddress()); //constructor bases injection
//		
//		return emp;
//	}
	
//	@Bean("emp")
//	public Employee1 createEmployee() {
//		Employee1 emp = new Employee1();
//		emp.setFirstName("Abhishek");
//		emp.setLastName("Ranjan");
//		emp.setAddress(createAddress());	// Injection through setter method
//		
//		return emp;
//	}

	
	
}
