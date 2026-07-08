package com.practice.hashset;

import java.util.HashSet;
import java.util.Set;

class Employee {
	String name;
	
	public Employee (String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		return this.name.equals(e1.name);
	}
}

public class Driver {
	public static void main(String[] args) {
		
		Set<Employee> hashSet = new HashSet<Employee>();
		
		Employee e1 = new Employee("Rahul");
		Employee e2 = new Employee("Rahul");
		Employee e3 = new Employee("Rahul");
		
		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		
		System.out.println("Total emp are " + hashSet.size());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
