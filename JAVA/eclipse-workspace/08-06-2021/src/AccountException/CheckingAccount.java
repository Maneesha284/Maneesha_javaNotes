package AccountException;

public class CheckingAccount {
	int accountNo;
	double balance;

	public CheckingAccount(int accountNo, double balance) {

		this.accountNo = accountNo;
		this.balance = balance;
	}

	boolean checkAccount(int accNo) {
		if (accountNo == accNo) 
			return true;
		else
			return false;

	}

	void deposite(double amount) {
		balance = balance + amount;
		System.out.println("After deposite your account balance:  " + balance);
	}

	double withdraw(double amount) throws InsufficientFundsException {
		if (amount < balance) {
			balance = balance - amount;
		} else {
			throw new InsufficientFundsException("Insufficient balance ");
		}
		return balance;
	}

}
