import java.util.Scanner;

public class RoundedSum {
	static int sumOfRoundedValues(int num1,int num2,int num3) {
		int result = 0;
		if(num1 < 0 || num1 < 0 || num1 < 0 || num1 == 0 || num2 == 0 || num3 == 0) {
			result = -1;
		}
		else {
		int multiple1 = 0, multiple2 = 0, multiple3 = 0;
		int l = num1 % 10;
		int m = num2 % 10;
		int n = num3 % 10;	
		if(num1 == 0 || l < 5) {
			multiple1 = num1 - l;
		}
		else {
			int i = num1 / 10;
			multiple1 = (i + 1) * 10;
		}
		if(num2 == 0 || m < 5) {
			multiple2 = num2 - m;
		}
		else {
			int j = num2 / 10;
			multiple2 = (j + 1) * 10;
		}
		if(num3 == 0 || n < 5) {
			multiple3 = 0;
		}
		else {
			int k = num3 / 10;
			multiple3 = (k + 1) * 10;
		}
		result = multiple1 + multiple2 + multiple3;
		}
		return result;
	}
	public static void main(String  s[]) {
		

		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		System.out.println(sumOfRoundedValues(sr.nextInt(), sr.nextInt(), sr.nextInt()));
	}

}
