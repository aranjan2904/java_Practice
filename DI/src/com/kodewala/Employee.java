package com.kodewala;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	
	//using constructor (if dependency is mandatory, immutable
	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
	}
	
	
	public Employee(String firstName, String lastName, String email, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}


	public void setAddress(Address _address) {
		
		address = address;
	}
	
}
