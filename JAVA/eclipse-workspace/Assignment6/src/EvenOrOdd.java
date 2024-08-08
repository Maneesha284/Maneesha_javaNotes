import java.util.Scanner;

public class EvenOrOdd {

		static String isEvenOrOdd(int num) {
				String result = "";
				
				if(num < 0 || num == 0) {
					result = "Invalid Input";
				}
				else {
					if(num % 2 == 0)
						result = "Even";
					else
						result = "Odd";
				}
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(isEvenOrOdd(sr.nextInt()));
			
		}
}
