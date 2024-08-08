package AccountException;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sr = new Scanner(System.in);
		CheckingAccount check = new CheckingAccount(123456, 20000);
		System.out.println("Enter account number");
		if (check.checkAccount(sr.nextInt())) {
			System.out.println("1.withdraw\n2.deposite\nEnter your choice");
			int ch = sr.nextInt();
			if (ch == 1) {
				System.out.println("Enter account number and  withdrawAmount");
				double currentAmount = check.withdraw(sr.nextDouble());
				System.out.println("After withdraw your account balance:  " + currentAmount);
			} else if (ch == 2) {
				System.out.println("Enter account number and depositeAmount");
				check.deposite(sr.nextDouble());

			} else {
				System.out.println("Worng choice");
				System.exit(0);
			}
		}
		else {
			System.out.println("you are invalid user");
		}

	}

}
