package stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();

		nameList.add("sumit");
		nameList.add("rohan");
		nameList.add("rahul");

		Stream<String> nameStream = nameList.stream();

		Stream<String> convertedSteam = nameStream.map(word -> word.toUpperCase());

		List<String> output = convertedSteam.collect(Collectors.toList());
		
		System.out.println(output);

	}
}
