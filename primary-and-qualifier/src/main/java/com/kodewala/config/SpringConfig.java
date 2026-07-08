package com.kodewala.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.kodewala")
public class SpringConfig {
	
	@Primary //by default inject bean, if no body specify which bean to inject, then this 
    @Bean("emp1")
    public Employee createEmp1() {
        return new Employee("Abhishek", "Ranjan", "2000");
    }

    @Bean("emp2")
    public Employee createEmp2() {
        return new Employee("Abhishek2", "Ranjan2", "4000");
    }
    
}