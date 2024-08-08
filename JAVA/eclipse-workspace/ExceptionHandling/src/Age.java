import java.util.Scanner;
import java.io.*;
class NotValidAge extends Exception {
	public NotValidAge(String message) {
		super(message);
	}
}
public class Age {
	public static void main(String[] args) throws ArithmeticException {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sr.nextInt();
		if (age <= 0) {
			throw new ArithmeticException("Age is not valid ");
		} else {
			System.out.println("Age is valid ");
		}

	}

}