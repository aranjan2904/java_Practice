package LinkHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("BLR");
		set.add("CHE");
		set.add("DEL");
		set.add("BLR");
		set.add("HYD");
		set.add("HYD");
		set.add("KOL");
		set.add("GOA");
		set.add("CHE");
		set.add("JAI");
		
		System.out.println(set);
	}
}
