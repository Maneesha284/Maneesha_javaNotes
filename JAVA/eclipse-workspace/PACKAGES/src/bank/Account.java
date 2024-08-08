package bank;

public class Account {
	private double balance;
	private  int accountNo;
	private float interestRate;
	private Customer customer;
	
	public Account(double balance, int accountNo, float interestRate, Customer customer) {
		this.balance = balance;
		this.accountNo = accountNo;
		this.interestRate = interestRate;
		this.customer = customer;
	}
	public double deposite(double amount){
		balance=balance+amount;
		return balance;	
	}
	public double withdraw(double amount){
		if(amount < balance)
			balance=balance-amount;
		return balance;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNo=" + accountNo + ", interestRate=" + interestRate
				+ ", customer=" + customer + "]";
	}
}
