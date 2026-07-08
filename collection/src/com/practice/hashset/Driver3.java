package com.practice.hashset;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver3 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("hyd");
		list.add("che");
		list.add("mumbai");
		
		Iterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			
			String element = itr.next();
			
			if(element.equals("hyd")) {
				itr.remove();
				System.out.println("element removed");
			}
		}
	}
}
