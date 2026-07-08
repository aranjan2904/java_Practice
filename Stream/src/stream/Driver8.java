package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8));
		
		System.out.println(numbers.stream().flatMap(n -> n.stream()).collect(Collectors.toList()));
			
	}
}
