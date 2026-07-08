package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("KA", "BLR"); // Write
		map.put("TN", "CHE"); // Write

		Set entries = map.entrySet();

		Iterator itr = entries.iterator();

		while (itr.hasNext()) {

			Entry entry = (Entry) itr.next();

			System.out.println(entry.getKey()); // Reading
		}
	}
}