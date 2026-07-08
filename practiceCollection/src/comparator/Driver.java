package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1, "Abhishek", 50000));

		employees.add(new Employee(2, "Rahul", 30000));

		employees.add(new Employee(3, "Aman", 40000));

		Collections.sort(employees, new SalaryComparator());
		
		for(Employee e : employees) {
			System.out.println(e.name + " " + e.salary);
		}
	}
}
