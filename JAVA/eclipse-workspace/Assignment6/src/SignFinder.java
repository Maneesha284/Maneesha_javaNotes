
import java.util.Scanner;

public class SignFinder {

		static int findSign(int num) {
				int result = 0;
				
				if(num == 0) {
					result = 0;
				}
				else if(num > 0){
					result = 1;
				}
				else {
					result = -1;
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(findSign(sr.nextInt()));
			
		}
}
