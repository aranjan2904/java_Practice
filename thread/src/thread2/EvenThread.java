package thread2;

public class EvenThread extends Thread{
	Task task;

	public EvenThread(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		task.evenNumber();
	}
	
}
