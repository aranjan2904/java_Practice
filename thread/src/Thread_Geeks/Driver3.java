package Thread_Geeks;

import java.util.*;

class Counter {
	private int c = 0;
	
	//synchronized method to increment counter
	public synchronized void inc() {
		c++;
	}
	
	//synchronized method to get counter value
	public synchronized int get() {
		return c;
	}
	
}

public class Driver3 {
	public static void main(String[] args) {
		
		//shared resources
		Counter cnt = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i< 1000; i++)
				cnt.inc();
		});
		
		Thread t2 = new Thread(() -> {
			for(int i =0; i < 1000; i++)
				cnt.inc();
		});
		
		t1.start();
		t1.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counter: " + cnt.get());
		
	}
}
