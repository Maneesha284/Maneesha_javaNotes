package bank;

import java.util.Scanner;

public class BankAppliaction {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter first name, last name, balance, accountNo, interestRate");
		String firstName = sr.next();
		String lastName = sr.next();
		double balance = sr.nextDouble();
		int accountNo = sr.nextInt();
		float interestRate = sr.nextFloat();
		
		Customer customer = new Customer(firstName, lastName);
		Account account = new Account(balance, accountNo, interestRate, customer);

		System.out.println("Enter your choice\n1.withdraw\n2.deposite");
		int ch = sr.nextInt();
		if (ch == 1) {
			System.out.println("Enter your withdrawAmount");
			double withdrawAmount = sr.nextDouble();
			balance = account.withdraw(withdrawAmount);
		} 
		else if (ch == 2) {
			System.out.println("Enter your depositeAmount");
			double depositeAmount = sr.nextDouble();
			balance = account.deposite(depositeAmount);
		}
		else {
			System.out.println("Worng choice");
			System.exit(0);
		}
		
		System.out.println(account);
	}

}
