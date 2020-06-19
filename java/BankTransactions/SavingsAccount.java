package task2;

public class SavingsAccount extends Account {
	public double interestRate;

	
	public SavingsAccount (int accNum) {
		super(accNum);
		this.interestRate = 0;
	}
	
	public void addInterest () {
		double bal1 = super.getBalance();
		double bal = bal1 * (1 + interestRate);
		super.setBalance(bal);
	}	
}
