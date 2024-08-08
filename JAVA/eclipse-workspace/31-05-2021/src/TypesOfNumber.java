import java.util.Scanner;

public class TypesOfNumber {
	static int sumOfProperDivisors(int num) {
		int result = 0, sum = 0;
		if (num < 0) {
			result = -2;
		} 
		else if (num == 0) {
			result = -3;
		} 
		else {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == num)
				result = 0;
			else if (sum > num)
				result = 1;
			else if (sum < num)
				result = -1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sr.nextInt();
		System.out.println(sumOfProperDivisors(num));

	}

}
