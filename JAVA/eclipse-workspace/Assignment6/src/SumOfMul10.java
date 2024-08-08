import java.util.Scanner;

public class SumOfMul10 {

		static int sumOfMultiples(int num1, int num2, int num3) {
				int result = 0;
				
				if(num1 < 0 || num1 < 0 || num1 < 0 || num1 == 0 || num2 == 0 || num3 == 0) {
					result = -1;
				}
				else {
					int quo1 = num1 / 10;
					int quo2 = num2 / 10;
					int quo3 = num3 / 10;
					int mul1 = (quo1 + 1) * 10;
					int mul2 = (quo2 + 1) * 10;
					int mul3 = (quo3 + 1) * 10;
					result = mul1 + mul2 + mul3;
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any three numbers:");
			System.out.println(sumOfMultiples(sr.nextInt(), sr.nextInt(), sr.nextInt()));
			
		}
}
