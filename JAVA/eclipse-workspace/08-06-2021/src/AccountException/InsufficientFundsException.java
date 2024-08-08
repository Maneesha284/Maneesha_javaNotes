package AccountException;

public class InsufficientFundsException extends Exception{
	double amount;
	public InsufficientFundsException(String msg) {
		super(msg);
	}
	double getAmount() {
		return amount;
	}

}
