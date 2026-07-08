package Map;

import java.util.HashMap;

public class LoginSystem {
	public static void main(String[] args) {

		HashMap<String, String> users = new HashMap<String, String>();

		users.put("abhishek@gmail.com", "1234");

		users.put("rahul@gmail.com", "5678");
		
		if(users.containsKey("rahul@gmail.com")) {
			System.out.println("user exists");
			
			String password = users.get("rahul@gmail.com");
			
			System.out.println("Password: " + password);
		}

	}
}
