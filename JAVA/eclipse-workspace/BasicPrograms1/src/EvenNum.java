import java.util.Scanner;

public class EvenNum {
	public static String isEven(int num) {
		String result = "";

		if (num % 2 == 0)
			result = num + " is even number";
		else
			result = num + " is not even number";
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sr.nextInt();
		System.out.println(isEven(num));

	}

}
