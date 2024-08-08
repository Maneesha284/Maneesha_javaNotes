import java.util.Scanner;

public class PrimeNum {
	private static String isPrimeNum(int num) {
		String result = "";
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			result = num + " is prime number";
		else
			result = num + " is not prime number";

		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any number: ");
		int num1 = sr.nextInt();

		System.out.println(isPrimeNum(num1));

	}

}
