import java.io.*;
class NoMoneyException extends Exception {
	public NoMoneyException(String message) {
		super(message);
	}
}

public class CustomException {
	/*public static void main(String[] args) throws ArithmeticException {
		int balance = 10000, withdraw = 15000;
		
			if(balance < withdraw) {
				throw new ArithmeticException("Insufficient balance");
			}
			else {
				System.out.println("Withdraw completed");
			}
			
		
	}*/
	public static void main(String[] args) {
		int balance = 10000, withdraw = 15000;
		try {
			if(balance < withdraw) {
				throw new NoMoneyException("Insufficient balance");
			}
			else {
				System.out.println("Withdraw completed");
			}
			
		}
		catch (NoMoneyException e) {
			System.out.println(e.getMessage());
		}
	}

}
