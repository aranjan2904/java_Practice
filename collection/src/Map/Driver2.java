package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Driver2 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("1", "sumit");
		map.put("3", "rahul");
		map.put("5", "piyush");
		map.put("4", "ganpat");
		
		for( Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
//		
//		Set entries = map.entrySet();
//		
//		Iterator itr = entries.iterator();
//		
//		while(itr.hasNext()) {
//			String entry = (String) itr.next();
//			System.out.println(entry.getKey);
//			
//		}
	}
}
