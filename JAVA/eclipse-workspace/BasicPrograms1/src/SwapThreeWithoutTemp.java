import java.util.Scanner;

public class SwapThreeWithoutTemp {
	private static void swap(int num1, int num2, int num3) {

		System.out.println("\nAfter swapping of three values");
		System.out.println("num1: " + num1 + "  num2: " + num2 + "  num3: " + num3);

	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any three values");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();
		int num3 = sr.nextInt();
		System.out.println("Before swapping of three values");
		System.out.println("num1: " + num1 + "  num2: " + num2 + "  num3: " + num3);
		swap(num1, num2, num3);
	}

}
