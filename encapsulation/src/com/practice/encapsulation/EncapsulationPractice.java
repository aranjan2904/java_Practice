package com.practice.encapsulation;

class Display {
	private String name;
	private int age;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age > 0 && age < 120) {
			this.age = age;
		}else {
			System.out.println("Invalid input");
		}
	}
	
	public int getAge() {
		return age;
	}
	
}

public class EncapsulationPractice {
	
	public static void main(String[] args) {
		Display display = new Display();
		
		display.setName("abhishek");
		display.setAge(25);
		
		System.out.println("user name is: "+ display.getName() + " and age is: "+display.getAge());
	}
}
