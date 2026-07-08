package com.practice.set;

class Employee {
	
	String firstName;
	String lastName;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e2 = (Employee) obj;
		return this.firstName.equals(e2.firstName) && this.lastName.equals(e2.lastName);
	}
	
	@Override
	public int hashCode() {
		return (this.firstName + this.lastName).hashCode();
	}
	
	
}

public class Driver {
	public static void main(String[] args) {
	
		Employee emp1 = new Employee("Abhishek", "Ranjan");
		Employee emp2 = new Employee("Abhishek", "Ranjan");
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
}
