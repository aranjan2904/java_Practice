package thread2;

public class Driver {
	public static void main(String[] args) {
		
		Task task = new Task();
		
		EvenThread evenThread = new EvenThread(task);
		evenThread.setName(" Even Thread");
		
		OddThread oddThread = new OddThread(task);
		oddThread.setName(" Odd Thread");
		
		evenThread.start();
		oddThread.start();
	}
}
