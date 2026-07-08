package com.practice.encapsulation;

final class Person {
	private final String name;
	private final int age;
	private final int id;
	//private final String address;
	
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
		//this.address = new Address(address.getCity());
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
	
	//public Address getAddress() {
	//	return new Address(address.getCity());
	//}
	
	
}

public class ImmutablePractice {
	public static void main(String[] args) {
		Person person = new Person("abhsihek", 25, 101);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getId());
		
	}
}
