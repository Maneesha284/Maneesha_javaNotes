import java.util.Scanner;

public class Adder {
	public static String getSum(int firstNum, int secondNum) {
		String sum = "";
		if (firstNum <= 0 || secondNum <= 0) {
			sum = "Error";
		} else {
			sum += firstNum + secondNum;
		}
		return sum;
	}

	public static void main(String s[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int firstNum = sr.nextInt();
		int secondNum = sr.nextInt();
		System.out.println(getSum(firstNum, secondNum));

	}

}
