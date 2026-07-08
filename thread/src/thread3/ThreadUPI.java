package thread3;

public class ThreadUPI extends Thread{
	
	UPI upi;
	
	public ThreadUPI(UPI upi) {
		super();
		this.upi = upi;
	}



	public void run() {
		upi.doPayment();
	}
}
