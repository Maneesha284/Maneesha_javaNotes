import java.util.Scanner;

public class RussianMultiplication {

	public static int getProduct(int num1, int num2) {
		int sum = 0;
		if ((num1 < 0) || (num2 < 0)) {
			sum = -1;
		} else {
			int i = num1, j = num2;
			sum = sum + num2;
			while (i != 1) {
				i = i / 2;
				j = j * 2;
				if (i % 2 == 1) {
					sum = sum + j;

				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Num1, and Num2  values");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();
		System.out.println("Product of the two numbers " + getProduct(num1, num2)+" of RussianMultiplication");

	}

}
