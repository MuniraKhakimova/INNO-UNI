package task2;

public class Account {
		private double balance;
		private int accNum;

	
	public Account(int accNum) {
		this.balance = 0.0;
		this.accNum = accNum;
	}

	public void deposit (double sum) {
	this.balance += sum;
	}
	public void withdraw (double sum) {
	this.balance -= sum;
	}

	public double getBalance() {
	return balance;
	}
	
	public void setBalance(double a) {
		this.balance = a;
	}

	public double getAccountNumber () {
	return accNum;
	}

	public void transfer (double amount, Account other) {
	balance -= amount;
	other.balance += amount;
	}

	public String toString() {
		return " "; 
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
