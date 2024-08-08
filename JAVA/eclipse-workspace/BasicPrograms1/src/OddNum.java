import java.util.Scanner;

public class OddNum {
	private static String isOdd(int num) {
		String result = "";

		if (num % 2 != 0)
			result = num + " is odd number";
		else
			result = num + " is not odd number";
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any number: ");
		int num = sr.nextInt();

		System.out.println(isOdd(num));

	}

}
