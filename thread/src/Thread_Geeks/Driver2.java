package Thread_Geeks;

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Driver2 {
	public static void main(String[] args) {
		MyThread g1 = new MyThread();
		
		Thread t1 = new Thread(g1); //initializing thread object
		
		t1.start(); //Running thread, start() create a new thread and it internally call run()
	}
}
