import java.util.Scanner;

public class PrintEvenNum {
	private static String getEvenNum(int num1, int num2) {
		String result = "";
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0)
				result += i + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any two number: ");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();

		System.out.println(getEvenNum(num1, num2));

	}

}
