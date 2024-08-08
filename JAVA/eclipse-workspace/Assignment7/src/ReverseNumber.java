import java.util.Scanner;

public class ReverseNumber {
	static int getReverse(int num) {
		int result = 0;
		int rem = 0;
		while(num > 0) {
			rem = num % 10;
			result = (result * 10) + rem;
			num = num / 10;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(getReverse(sr.nextInt()));

	}
	
}
