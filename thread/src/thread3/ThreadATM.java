package thread3;

public class ThreadATM extends Thread{
	
	ATM atm;
	
	public ThreadATM(ATM atm) {
		super();
		this.atm = atm;
	}

	public void run() {
		atm.doPayment();
	}
}
