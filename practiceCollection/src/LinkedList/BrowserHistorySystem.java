package LinkedList;

import java.util.LinkedList;

public class BrowserHistorySystem {
	public static void main(String[] args) {
		
		LinkedList<String> history = new LinkedList<String>();
		
		history.add("Google");
		history.add("YouTube");
		history.add("GitHub");
		
		System.out.println("Browser History");
		
		for(String page : history) {
			System.out.println(page);
		}
		
		System.out.println();
		
		history.removeLast();
		
		System.out.println("After Back Button");
		
		for(String page : history) {
			System.out.println(page);
		}
		
		System.out.println();
		
		history.addFirst("ChatGPT");
		
		System.out.println("After Opening New Page:");
		
		for(String page : history) {
			System.out.println(page);
		}
	}
}
