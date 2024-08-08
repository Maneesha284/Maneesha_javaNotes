import java.util.Scanner;

public class PrintPrimeNum {
	private static String getPrimeNum(int num1, int num2) {
		String result = "";
		for(int i = num1; i <= num2; i++) {
			int flag=0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				result += i+" ";
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any two number: ");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();

		System.out.println(getPrimeNum(num1, num2));

	}

}
