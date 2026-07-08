package intro;

class Task {
	public void performTask() {
		for(int i=0;i<=10;i++) {
			System.out.println("number: "+ i + Thread.currentThread().getName());
		}
	}
}

class MyThread implements Runnable {
	
	Task task;
	
	MyThread (Task task){
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println("run method: " + Thread.currentThread().getName());
		task.performTask();
	}
	
}

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("START " + Thread.currentThread().getName());
		
		Task task = new Task();
		 
		MyThread myThread = new MyThread(task);
		
		Thread t1 = new Thread(myThread);
		
		t1.start();
		
	}
}
