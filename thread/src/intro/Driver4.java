package intro;

class Task1{
	public void display() {
		System.out.println("This is task1 class display method done by thread: "+ Thread.currentThread().getName());
	}
}

class MyThread1 implements Runnable {
	
	Task1 task1;
	
	MyThread1(Task1 task1) {
		this.task1 = task1;
	}
	
	@Override
	public void run() {
		task1.display();
	}
}

public class Driver4 {
	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		
		MyThread1 myThread1 = new MyThread1(task1);
		
		Thread t1 = new Thread(myThread1);
		t1.start();
		
		Thread t2 = new Thread(myThread1);
		t2.start();
	}
}
