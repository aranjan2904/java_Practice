package intro;

class Task3 {
	public void display() {
		System.out.println("printing display");
		try {
			Thread.sleep(2000); // 2 sec --> waiting / blocked
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("printing after 2 sec");
	}

}

class MyThread3 implements Runnable{
	
	Task3 task3;
	
	MyThread3(Task3 task3){
		this.task3 = task3;
	}

	@Override
	public void run() { //RUNNING
		task3.display();
	} // DEAD STATE
	
}

public class Driver5 {
	public static void main(String[] args) {
		
		Task3 task3 = new Task3();
		
		MyThread3 myThread3 = new MyThread3(task3);
		
		Thread t1 = new Thread(myThread3); //NEW
		t1.start(); //RUNNABLE

	}
}
