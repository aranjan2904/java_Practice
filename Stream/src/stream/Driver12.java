package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver12 {
	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7),Arrays.asList(8,9));
		
		System.out.println(list);
		
		List<Integer> flatList = list.stream().flatMap(w -> w.stream()).collect(Collectors.toList());
		
		System.out.println(flatList);
	}
}
