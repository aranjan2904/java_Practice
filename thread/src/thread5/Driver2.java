package thread5;


public class Driver2 {
	public static void main(String[] args) {
		
		Task task = new Task();
		
		ProducerThread pThread = new ProducerThread(task);
		ConsumerThread cThread = new ConsumerThread(task);
		
		pThread.start();
	}
}
