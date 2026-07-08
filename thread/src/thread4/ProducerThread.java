package thread4;

public class ProducerThread extends Thread{

	Task1 task1;
	
	public ProducerThread(Task1 task) {
		this.task1 = task;
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<10; i++) {
			try {
				task1.produce(i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
