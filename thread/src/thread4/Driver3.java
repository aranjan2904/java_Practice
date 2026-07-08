package thread4;

public class Driver3 {
	public static void main(String[] args) {
		Task1 task = new Task1();
		
		ProducerThread produceThread = new ProducerThread(task);
		//ConsumerThread consumeThread = new ConsumerThread(task);
		
		produceThread.start();
		//consumeThread.start();
	}
}
