package Map;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

public class Driver3 {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Mohan", 12000);
		Employee e2 = new Employee("Meera", 14000);
		Employee e3 = new Employee("Sohan", 17000);
		Employee e4 = new Employee("Ganpat", 18000);
		Employee e5 = new Employee("Rohan", 10000);
		Employee e6 = new Employee("Abhishek", 10000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		Collections.sort(list , new NameComparator());
		for(Employee emp : list) {
			System.out.println(emp.getName() + " " + emp.getSalary());
		}
		
		System.out.println("-------------------------------------");
		
		Collections.sort(list, new SalaryComparator());
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " " + emp.getSalary());
		}
		
	}
}
