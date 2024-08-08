
import java.util.Scanner;

public class OddRounder {

		static int oddRounder(int num) {
				int result = 0;
				
				if(num < 0) {
					result = -1;
				}
				else if(num == 0){
					result = -2;
				}
				else {
					if(num % 2 == 0) {
						result = num;
					}
					else {
						int quo = num / 10;
						result = (quo + 1) * 10;
					}
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(oddRounder(sr.nextInt()));
			
		}
}
