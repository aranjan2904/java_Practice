package Thread_Geeks;

class MyThread extends Thread {
	public void run() {
		String str = "Thread Started Running.....";
		System.out.println(str);
	}
}

public class Driver {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
	}
}
