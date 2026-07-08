package comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public int compareTo(Student s) {

		return this.id - s.id;
	}
}

public class Drver {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student(103, "Rahul"));

		students.add(new Student(101, "Abhishek"));

		students.add(new Student(102, "Aman"));
		
		Collections.sort(students);
		
		for(Student s : students) {
			System.out.println(s.id + " " + s.name);
		}

	}
}
