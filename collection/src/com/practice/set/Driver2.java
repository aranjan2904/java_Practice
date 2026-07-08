package com.practice.set;

import java.util.HashSet;

class Emp {
	
	@Override
    public boolean equals(Object obj) {
        return false;
    }
	
	@Override
	public int hashCode() {
		System.out.println("calling hashcode");
		return 1234321;
	}
}

public class Driver2 {
	public static void main(String[] args) {
		
		HashSet<Emp> hashEmp = new HashSet<Emp>(64);
		
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		hashEmp.add(new Emp());
		
		System.out.println(hashEmp);
		
		Emp emp1 = new Emp();
		hashEmp.add(emp1);
		
		System.out.println(hashEmp);
		
		hashEmp.remove(emp1);
	}
}
