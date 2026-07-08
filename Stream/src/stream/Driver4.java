package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver4 {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> classroom = new ArrayList<>();

        classroom.add(new ArrayList<>(Arrays.asList("Aman", "Rahul")));

        classroom.add(new ArrayList<>(Arrays.asList("Abhishek", "Priya")));

        System.out.println(classroom);
        
        
       Stream<String> flatStream =  classroom.stream().flatMap(list -> list.stream());
       
       List<String> output = flatStream.collect(Collectors.toList());
       
       System.out.println(output);
       
       
       
    }
}