package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> users = new ArrayList<String>();
		
		users.add("Abhishek");

		users.add("Rahul");

		users.add("SpamUser");
		
		Iterator<String> it = users.iterator();
		
		while(it.hasNext()) {
			String user = it.next();
			System.out.println(user);
			
			if(user.equals("Abhishek")) {
				users.remove(user);
				//it.remove();
			}
		}
		
		System.out.println(users);
		
	}
}
