package com.practice.collection;

import java.util.LinkedList;

public class Driver {
	public static void main(String[] args) {
		
		LinkedList<String> city = new LinkedList<String>();
		
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Banglore");
		city.add("chennai");
		city.add("Hyderabad");
		
		System.out.println(city);
		
		city.add(1,"kerla");
		System.out.println(city);
	}
}
