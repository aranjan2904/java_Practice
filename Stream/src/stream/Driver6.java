package stream;

import java.util.*;

public class Driver6 {
	public static void main(String[] args) {

		List<Integer> number = new ArrayList<Integer>();
		
		number.add(1);
		number.add(6);
		number.add(3);
		number.add(8);
		number.add(9);
		
		int output = number.stream().sorted((a,b) -> b - a).skip(1).findFirst().get();
		
		System.out.println(output);
		
	}
}
