package thread5;

class Task1 {

	public  void doSomeTask() throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			System.out.println("Task.doSomeTask() : "+ Thread.currentThread().getName());
			Thread.sleep(1000); //t1 is holding object lock of task object
			wait(1000); // will release object lock and goes to waiting state
		}
	}
}

class MyThread extends Thread {
	private Task1 task;
	
	public MyThread(Task1 task) {
		this.task = task;
	}
	
	
	
	@Override
	public void run() {
		try {
			task.doSomeTask();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}

public class Driver {
	public static void main(String[] args) {
		
		Task1 task = new Task1();
		
		MyThread t1 = new MyThread(task);
		t1.start();
	}
}
