package com.practice.set;

import java.util.HashSet;

public class DriverHashSet {
	public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>(64);
		
		city.add("Hyderabad");
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Bangalore");
		city.add("Chennai");
		city.add("Kolkata");
		city.add("Pune");
		city.add("Jaipur");
		city.add("Lucknow");
		city.add("Patna");
		city.add("Ahmedabad");
		city.add("Surat");
		//
		
		System.out.println(city);
		
		city.add("Kanpur");
		
		System.out.println(city);
		System.out.println("Pune".hashCode());
	}
}
