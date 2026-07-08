package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver3 {
	public static void main(String[] args) {
		
		// find square of all even numbers
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers);
		
		Stream<Integer> streamNumber = numbers.stream();
		
		Stream<Integer> evenStreamNumber = streamNumber.filter(e -> e % 2 == 0);
		
		Stream<Integer> squareNumber = evenStreamNumber.map(s -> s*s);
		
		List<Integer> result = squareNumber.collect(Collectors.toList());
		
		System.out.println(result);
		
		
	}
}
