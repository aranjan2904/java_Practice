package com.kodewala.singleton;

public class Driver {
	public static void main(String[] args) {
		
		IntCalc intCalc = IntCalc.getInstance(); // someone
		
		IntCalc intCalc2 = IntCalc.getInstance(); // you
		
		IntCalc intCalc3 = IntCalc.getInstance(); //other person
	}
}
