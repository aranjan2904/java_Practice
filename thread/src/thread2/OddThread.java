package thread2;

public class OddThread  extends Thread{
	Task task;

	public OddThread(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		task.oddNumber();
	}
	
}
