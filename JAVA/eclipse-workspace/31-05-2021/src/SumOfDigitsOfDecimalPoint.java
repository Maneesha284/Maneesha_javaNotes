import java.util.Scanner;

public class SumOfDigitsOfDecimalPoint {

	

	private static String getSumOfDigits(double num) {
		String number = Double.toString(num);
		String arr[] = number.split("[.]");
		int value = Integer.parseInt(arr[0]);
		int decvalue = Integer.parseInt(arr[1]);

		int valueSum = sum(value);
		int decimalSum = sum(decvalue);

		return valueSum + ":" + decimalSum;
	}

	private static int sum(int num) {
		int sum = 0;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			sum += temp;
			num = num / 10;
		}
		return sum;
	}
public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter a Double Number:");
		double num = sr.nextDouble();

		System.out.println(getSumOfDigits(num));
	}

}
