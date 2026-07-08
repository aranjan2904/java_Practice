package hashSet;

import java.util.HashSet;

public class RegistrationSystem {
	public static void main(String[] args) {
		
		HashSet<String> emails = new HashSet<String>();
		
		emails.add("abhishek@gmail.com");

        emails.add("rahul@gmail.com");

        emails.add("abhishek@gmail.com");

        System.out.println(emails);
        
        	if(emails.contains("rahul@gmail.com")) {
        		System.out.println("yes contains");
        	}else {
        		System.out.println("not contain");
        	
        }
	}
}
