package bank;

public class Savings extends Account {

	int customer_id;
	// double balance;
	double interest_rate;
	double overdraft;

	public Savings() {
		customer_id = 0;
		// balance=0;
		interest_rate = 0;
		overdraft = 0;

	}

	public Savings(int account_id, double balance, int customer_id, double overdraft, double interest_rate) {
		super(account_id, balance);
		this.customer_id = customer_id;
		// this.balance = balance;
		this.interest_rate = interest_rate;
		this.overdraft = overdraft;
	}

	public void deposit(double depositAmt) {
		balance = balance + depositAmt;
		System.out.println("Total available balance is:" + balance);
	}

	public double addInterest() {
		double interestAmt = (balance * interest_rate) / 100;
		return interestAmt;

	}

	public void withdraw(double withdrawAmt) {
		
		if (overdraft <= 200) {
		
		if (balance + overdraft >= withdrawAmt) {
			balance = (balance + overdraft) - withdrawAmt + addInterest();
			System.out.println("Account balance is:" + balance);
		} 
		
		} else {
			System.out.println("The withdraw amount is out of range.");
			System.out.println("************************************");
			System.out.println("Please try again");
		}

	}

}
