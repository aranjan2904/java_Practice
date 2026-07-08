package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver5 {
	public static void main(String[] args) {
		
		//nested arrayList
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2,3,4,5,6),Arrays.asList(20,125,54,67,75,88,23));
		
		//converted to flat from nested
		 Stream<Integer> flatMap = numbers.stream().flatMap(list -> list.stream());
		 
		 //filter even number
		// flatMap.filter(e -> e%2 == 0).forEach(value -> System.out.print(value));
		 
		 //remove dublicate
		 List<String> word = Arrays.asList("i","am", "from", "banglore", "banglore", "is","in" ,"karnataka", "banglore", "is" ,"is", "in", "karnataka");
		 
		 word.stream().distinct().forEach(v -> System.out.println(v));
		 System.out.println("---------------------------");
		 
		 //find first
		 String first = word.stream().distinct().findFirst().get();
		 
		 System.out.println(first);
		 
		 System.out.println("---------------------------");
		 
		 //limit the fifth element
		word.stream().limit(4).forEach(v -> System.err.println(v));
		System.out.println("-----------------------------");
		
		//sort
		word.stream().sorted().forEach(v -> System.err.println(v));
		System.out.println("----------------------------");
		
		//sorting
		List<Integer> input = Arrays.asList(1,4,6,2,1,8,5,9,3,5,3,5,7);
		int output = input.stream().distinct().sorted((a,b) -> b-a).skip(1).findFirst().get();
		System.out.println(output);
	}

}
