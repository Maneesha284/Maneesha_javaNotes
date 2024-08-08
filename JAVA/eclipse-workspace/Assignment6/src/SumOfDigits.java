
import java.util.Scanner;

public class SumOfDigits {

		static int getSumOfDigits(int num) {
				int result = 0;
				
				if(num >= 10 && num <= 99) {
					int rem = num % 10;
					int quo = num / 10;
					result = rem + quo;
				}
				else if(num < 0) {
					result = -3;
				}
				else if(num > 99) {
					result = -2;
				}
				else if(num >= 0 && num <= 9) {
					result = -1;
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(getSumOfDigits(sr.nextInt()));
			
		}
}
