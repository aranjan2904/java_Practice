package stream;
import java.util.*;

public class Driver7 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("banglore","chennai","banglore","hyderabad","delhi");
		
		HashSet<String> set = new HashSet<String>();
		
		cities.stream().filter(w -> !set.add(w)).forEach(e -> System.out.println(e));
	}
}
