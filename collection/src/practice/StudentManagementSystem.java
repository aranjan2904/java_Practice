package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class StudentManagementSystem {
	public static void main(String[] args) {

		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student(101, "abhishek", 85, "B.Tech"));
		studentsList.add(new Student(102, "rahul", 90, "B.Tech (IT)"));

		for (Student s : studentsList) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println(s.course);

			System.out.println();
		}

		int searchId = 102;
		
		
		for (Student s : studentsList) {
			if (s.id == searchId) {
				System.out.println("Student found");
				System.out.println(s.name);
			} else {
				System.out.println("Student not found");
			}
		}
		System.out.println("-----------------------------------");

		// ----------------------------
		
		int searchId2 = 999;

		HashMap<Integer, Student> studentsMap = new HashMap<Integer, Student>();
		
		studentsMap.put(101, new Student(101, "abhishek", 85, "B.Tech"));
		studentsMap.put(102, new Student(102, "rahul", 95, "B.Tech"));
		studentsMap.put(103, new Student(103, "aman", 75, "B.sc"));
		studentsMap.put(104, new Student(104, "priya", 45, "B.CA"));
		
		
		Student s = studentsMap.get(102);
		System.out.println(s.name);
		
		if (studentsMap.containsKey(searchId2)) {
			Student s2 = studentsMap.get(999);
			System.out.println(s2.name);
			
		}else {
			System.out.println("Student not found");
		}
		
		System.out.println("-------------------------------");
		
		//-------------------------------------
		
		int updateId = 101;
		
		if(studentsMap.containsKey(updateId)) {
			Student s3 = studentsMap.get(updateId);
			s3.marks = 95;
			System.out.println("marks updated");
		}
		System.out.println("-------------------------");
		
		//---------------------------------------
		
		
		System.out.println(studentsMap.size());
		 System.out.println("-------------------");
		 
		 //---------------------------------
		 
		 for (Student student : studentsMap.values()) {
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.marks);
			System.out.println(student.course);
			
			System.out.println();
		}
		 
		 System.out.println("-----------------------");
		 for (Integer id : studentsMap.keySet()) {
			System.out.println(id);
		}
		 
		 System.out.println("--------------------------------");
		 
		 //--------------------------------------------
		 
		 for( Entry<Integer, Student> entry : studentsMap.entrySet()) {
			 Integer id = entry.getKey();
			 Student object = entry.getValue();
			 
			 System.out.println(id);
			 System.out.println(object.name);
			 System.out.println();
		 }
		
		
	}
}
