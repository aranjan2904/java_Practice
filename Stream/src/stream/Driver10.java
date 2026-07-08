package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver10 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,4,5,2,3,6,7,9,8);
		
		 Map<String, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(w -> w %2 == 0? "Even":"Odd" ));
		 
		 System.out.println(map);
	}
}
