
import java.util.Scanner;

public class EvenFinder {

		static int isEven(int num) {
				int result = 0;
				
				if(num < 0 || num == 0) {
					result = -1;
				}
				else {
					if(num % 2 == 0)
						result = 1;
					else
						result = 0;
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(isEven(sr.nextInt()));
			
		}
}
