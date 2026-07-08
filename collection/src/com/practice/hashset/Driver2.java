package com.practice.hashset;

import java.util.HashSet;

class Student {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	
}

public class Driver2 {
	public static void main(String[] args) {
		
		HashSet<Student> studentHashSet = new HashSet<Student>();
		
		Student s1 = new Student("Abhishek");
		Student s2 = new Student("Rahul");
		Student s3 = new Student("Aman");
		Student s4 = new Student("Rohit");
		Student s5 = new Student("Priya");
		Student s6 = new Student("Sneha");
		Student s7 = new Student("Karan");
		Student s8 = new Student("Vikas");
		Student s9 = new Student("Anjali");
		Student s10 = new Student("Neha");
		Student s11 = new Student("Arjun");
		Student s12 = new Student("Pooja");
		Student s13 = new Student("Suresh");
		
		studentHashSet.add(s1);
		studentHashSet.add(s2);
		studentHashSet.add(s3);
		studentHashSet.add(s4);
		studentHashSet.add(s5);
		studentHashSet.add(s6);
		studentHashSet.add(s7);
		studentHashSet.add(s8);
		studentHashSet.add(s9);
		studentHashSet.add(s10);
		studentHashSet.add(s11);
		studentHashSet.add(s12);
		studentHashSet.add(s13);
		
		System.out.println(s13.hashCode());
		
		
	}
}
