package intro;

class Mythread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hello... from thread...." + Thread.currentThread().getName());
	}
}

public class Driver {
	public static void main(String[] args) {
		
		System.out.println("START");
		
		Mythread2 t1 = new Mythread2();
		t1.start();
		
		Mythread2 t2 = new Mythread2();
		t2.start();
		
		System.out.println("END");
	}
}
