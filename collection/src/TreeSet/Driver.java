package TreeSet;

import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable<Student> {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}
public class Driver {
	public static void main(String[] args) {
		
		Set<Student> set = new TreeSet<Student>();
		
		set.add(new Student("sumit"));
		set.add(new Student("abhishek"));
		set.add(new Student("rahul"));
		set.add(new Student("piyush"));
		set.add(new Student("abhishek"));
		System.out.println(set.size());
		
		for(Student std : set) {
			System.out.println(std.name);
		}
	}
}
