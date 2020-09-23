package bank;

import java.util.Scanner;

public class LoginName_Account {
	
	 public static int operationsMenu(Scanner sc)
	 {
		 
			System.out.println("***Operations*****");
			System.out.println("***1.Deposit*****");
			System.out.println("***2.Withdraw*****");

			System.out.println("***Enter which operation you want to do*****");
			int ch = Integer.parseInt(sc.next());
		 
		 return ch;
		 
		 
	 }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Id:");
		int account_id = Integer.parseInt(sc.next());
		System.out.println("Enter balance:");
		double balance = Double.parseDouble(sc.next());
		System.out.println("***Operations*****");
		System.out.println("***1.Saving*****");
		System.out.println("***2.Checking*****");

		System.out.println("***Enter which operation you want to do*****");
		int ch = Integer.parseInt(sc.next());
		double depositAmount, withdrawAmount;
		switch (ch) {
		case 1:
			System.out.println("Enter Customer Id:");
			int customer_id_saving = Integer.parseInt(sc.next());
			System.out.println("Enter overdraft:");
			double overdraft = Double.parseDouble(sc.next());
			System.out.println("Enter interest_rate:");
			double interest_rate = Double.parseDouble(sc.next());

			Savings savings = new Savings(account_id, balance, customer_id_saving, overdraft, interest_rate);
			
			int opt1=operationsMenu(sc);
			
			switch(opt1)
			{
			case 1:
				System.out.println("Enter The deposit Amount");
				depositAmount = Double.parseDouble(sc.next());
				savings.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter The withdraw Amount");
				withdrawAmount = Double.parseDouble(sc.next());
				savings.withdraw(withdrawAmount);
				break;
			default:
				System.out.println("Input does not match");		
			}
			
			
			
			break;
		case 2:
			System.out.println("Enter Customer Id:");
			int customer_id = Integer.parseInt(sc.next());

			System.out.println("Enter transferFee:");
			double transferFee = Double.parseDouble(sc.next());

			Checking checking = new Checking(account_id, balance, customer_id, transferFee);
			
			int opt2=operationsMenu(sc);
			
			switch(opt2)
			{
			case 1:
				System.out.println("Enter The deposit Amount");
				depositAmount = Double.parseDouble(sc.next());
				checking.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter The withdraw Amount");
				withdrawAmount = Double.parseDouble(sc.next());
				checking.withdraw(withdrawAmount);
				break;
			default:
				System.out.println("Input does not match");		
				  
			}
			
			break;
		
		default:
			System.out.println("Wrong choice");
			
		}
		sc.close();
	}

}
