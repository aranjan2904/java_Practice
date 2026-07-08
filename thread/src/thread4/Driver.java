package thread4;

class Cook extends Thread {
	public void run() {
		try {
			System.out.println("cooking food - started");
			Thread.sleep(2000);
			System.out.println("Cooking food - Ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Driver {
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Waiter");

		Cook cookThread = new Cook();
		cookThread.start();
		cookThread.join();
		System.out.println("Waiter - started serving food");
	}
}
