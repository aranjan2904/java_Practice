package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Driver {
	public static void main(String[] args) {
		
		List<String> set = new  ArrayList<>();
		
		set.add("aman");
		set.add("mohan");
		set.add("ram");
		
		 Iterator<String> itr = set.iterator();
		 
		 while(itr.hasNext()) {
			 String element = itr.next();
			 if(element.equals("mohan")) {
				 itr.remove();
			 }
		 }
		 System.out.println(set);
	}
}
