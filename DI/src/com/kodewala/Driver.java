package com.kodewala;

public class Driver {
	public static void main(String[] args) {
		
		Address address = new Address("2nd floor", "Sri tirumala millinium", "560076", "Tenangana");
		
		Employee employee = new Employee("abhishek", "ranjan", "abhishek@gmail.com");
		
		//using setter method to inject address object ( dependency is optional & mutable)
		employee.setAddress(address);
		
		System.out.println();
	}
}
