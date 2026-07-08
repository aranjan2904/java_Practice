package TreeSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee {

    String name;
    String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
  
}

public class Driver2 {

    public static void main(String[] args) {

        Employee e1 = new Employee("abhishek", "1");
        Employee e2 = new Employee("sumit", "3");
        Employee e3 = new Employee("sumit", "2");
        Employee e4 = new Employee("bhanu", "6");

        Map<String, Employee> eMap = new HashMap<String,Employee>();

        eMap.put(e1.name, e1);
        eMap.put(e2.name, e2);
        eMap.put(e3.name, e3);
        eMap.put(e4.name, e4);
        
        Set<Entry<String, Employee>> entrySet = eMap.entrySet();
        
        Iterator<Entry<String, Employee>> itr1 = entrySet.iterator();
        
        while(itr1.hasNext()) {
        	Entry<String,Employee> entry = itr1.next();
        	String key = entry.getKey();
        	Employee value = entry.getValue();
        	System.out.println("key: " + key + " , value: " + value);
        }
        

        System.out.println(eMap);
    }
}