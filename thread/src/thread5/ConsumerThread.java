package thread5;

public class ConsumerThread extends Thread{
	Task task;
	
	public ConsumerThread(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i < 10; i++) {
			try {
				task.consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
