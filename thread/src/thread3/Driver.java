package thread3;

class Bank {

	public void doPayment() {
		System.out.println("doing payment");
	}
}

class UPI extends Bank {

	@Override
	public void doPayment() {
		
		synchronized(this) {
			
			System.out.println("doing payment via upi");
		}
	}

}

class ATM extends Bank {

	@Override
	public void doPayment() {

		synchronized (this) {

			System.out.println("doing payment via ATM");
		}
	}

}

public class Driver {
	public static void main(String[] args) {

		UPI upi = new UPI();

		ATM atm = new ATM();

		ThreadUPI upiThread = new ThreadUPI(upi);

		ThreadATM atmThread = new ThreadATM(atm);

		upiThread.start();
		atmThread.start();

	}
}
