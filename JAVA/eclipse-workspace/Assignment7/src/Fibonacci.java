import java.util.Scanner;

public class Fibonacci {
	static String getFibnocacci(int num) {
		String result = "";
		int fib1 = 0 , fib2 = 1, fib3 = 0;
		int i = 0;
		while(i < num) {
			fib3 = fib1 + fib2;
			result += fib1 + " ";
			fib1 = fib2;
			fib2 = fib3;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(getFibnocacci(sr.nextInt()));
	}
}
