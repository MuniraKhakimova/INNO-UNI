package task2;

public class CheckingAccount extends Account {
	public int counter;
	public int freeTranc;
	
	public CheckingAccount (int accNum) {
		super(accNum);
		this.counter = 0;
	}
	
	public void deductFee () {
		counter -= freeTranc;
		double bal = super.getBalance();
		double bal1 = bal - counter*20;
		super.setBalance(bal1);
	}
	

	
	
	
	
	
}
