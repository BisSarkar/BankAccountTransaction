package bank;

public class Checking extends Account {

	int customer_id;
	// double balance;
	double transferFee;

	public Checking() {
		customer_id = 0;
		// balance=0;
		transferFee = 0;
	}

	public Checking(int account_id, double balance, int customer_id, double transferFee) {
		super(account_id, balance);
		this.customer_id = customer_id;
		// this.balance = balance;
		this.transferFee = transferFee;
	}

	public void deposit(double depositAmt) {
		balance = balance + depositAmt;
		System.out.println("Total available balance is:" + balance);
	}

	public void withdraw(double withdrawAmt) {
		if (balance >= withdrawAmt) {
			balance = balance - withdrawAmt - transferFee;
			System.out.println("Account balance is:" + balance);
		} else {
			System.out.println("Can Not withdraw more than current balance");
		}
	}

}
