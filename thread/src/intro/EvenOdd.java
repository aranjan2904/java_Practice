package intro;

import java.util.Iterator;

class Even extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even no. " + i + " " + Thread.currentThread().getName());
			}
		}
	}
}

class Odd extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd no. " + i + " " + Thread.currentThread().getName());
			}
		}
	}
}

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("START");

		Even even = new Even();
		even.start();

		Odd odd = new Odd();
		odd.start();

		System.out.println("END");
	}
}
