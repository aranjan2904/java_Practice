package thread2;

public class Task {

	public synchronized void evenNumber() {
		for (int i = 0; i <= 9; i++) {
			if (i % 2 == 0) {

				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}
		System.out.println("-----------------------");
	}

	public synchronized void oddNumber() {
		for (int i = 0; i <= 9; i++) {
			if (i % 2 != 0) {

				System.out.println(i + " by " + Thread.currentThread().getName());
			}
		}
		System.out.println("----------------------------");
	}
}
