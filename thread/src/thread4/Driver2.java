package thread4;

class Task {
	public synchronized void doSomeTask() throws InterruptedException {
		for(int i=0; i< 10; i++) {
			System.out.println("Task do something");
			Thread.sleep(1000);
			wait(1000);
		}
	}
}

class MyThread extends Thread{
	private Task task;
	
	public MyThread(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		try {
			task.doSomeTask();
		}catch(InterruptedException e) {
			
		}
	}
}
public class Driver2 {
	public static void main(String[] args) {
		Task task = new Task();
		
		MyThread myThread = new MyThread(task);
		
		myThread.start();
		
	}
}
