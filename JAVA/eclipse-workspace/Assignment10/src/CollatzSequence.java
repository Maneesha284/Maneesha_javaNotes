import java.util.InputMismatchException;
import java.util.Scanner;

public class CollatzSequence {

	public static String getSequence(int num) {
		String str = "";
		if (num < 0) {
			System.out.println("Error");
		} 
		else {
			str = str + num + " ";
			int tries = 1;
			while (num != 1) {
				if (num % 2 == 0)
					num = num / 2;
				else if (num % 2 == 1)
					num = (num * 3) + 1;
				tries++;
				if (tries > 100) {
					System.out.println("Does not Converge");
				} 
				else {
					str = str + num + " ";
				}
			}
		
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter input value");
		int num = sr.nextInt();

		System.out.println("Get collatz sequence numbers of a Given number: " +getSequence(num));
	}

}
