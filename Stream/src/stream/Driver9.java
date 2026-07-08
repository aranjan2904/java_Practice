package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver9 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Shivam", "Bhanu","Rahul", "Raju","Shailesh");
		
	   Map<Integer, List<String>> map	= words.stream().collect(Collectors.groupingBy(w -> w.length()));
	   
	   System.out.println(map);
	}

}
