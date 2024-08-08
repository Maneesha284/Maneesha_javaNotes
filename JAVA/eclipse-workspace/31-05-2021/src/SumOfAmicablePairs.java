import java.util.Scanner;

public class SumOfAmicablePairs {
	static int sumOfAmicablePairs(int num) {
		int result = 0, sum = 0;
		if (num < 0) {
			result = -1;
		} 
		else if (num == 0) {
			result = -2;
		} 
		else {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			result = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sr.nextInt();
		System.out.println(sumOfAmicablePairs(num));

	}

}
