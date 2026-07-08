package test;

public class BankAccount {
	String accountHolderName;
	int accountBalace;
	
	BankAccount(String accountHolderName, int accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountBalace = accountBalance;
	}
	void display() {
		System.out.println(accountHolderName + " "+ accountBalace);
	}
	
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("Piyush", 5);
		bank.display();
		
	}
}
