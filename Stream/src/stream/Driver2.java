package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {
	public static void main(String[] args) {
			List<String> cities = Arrays.asList("daltonganj","garhwa","deoghar", "dehradun","dumka");
			System.out.println(cities);
			
			//convert collection to stream
		    Stream<String> inputstream = cities.stream();
		    
		    //applying filter to stream
		    Stream<String> filteredStream = inputstream.filter(c -> c.startsWith("d"));
		    
		    //applying map(it will convert word starting with c to upperCase)
		    Stream<String> upperCaseStream = filteredStream.map(w -> w.toUpperCase());
		    
		    //collecting result .collect(this is the terminal operation it will terminate the stream)
		    List<String> result = upperCaseStream.collect(Collectors.toList());
		    
		    System.out.println("Result: " + result);
		    
	}
}
