package intro;

class MyTask implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}

public class Driver3 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyTask());
		t1.start();
	}
}
