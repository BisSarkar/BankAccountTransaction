package bank;

public abstract class Account {

	int account_id;
	double balance;
	
		
			
	public Account() {
		
		
	}
	
	 public Account(int account_id, double balance) {
			super();
			this.account_id = account_id;
			this.balance = balance;
		}
		
	 public abstract void deposit(double depositAmt);
	
	 
	 public abstract  void withdraw (double withdrawAmt);

	 
}
