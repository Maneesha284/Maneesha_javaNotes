import java.util.Scanner;

public class Rounder {

		static int calculate(int num) {
				int result = 0;
				
				if(num < 0 || num == 0) {
					result = -1;
				}
				else {
					if(num % 2 == 0)
						result = num * num;
					else
						result = num * num * num;
				}
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(calculate(sr.nextInt()));
			
		}
}
