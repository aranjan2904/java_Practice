package thread5;

public class ProducerThread extends Thread{
	Task task;
	
	public ProducerThread(Task task) {
		this.task = task;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			try
			{
				task.produce(i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
