import java.util.Scanner;

public class MultipleOf100 {

		static int getNextMultipleOf100(int num) {
				int result = 0;
				
				if(num < 0 || num == 0) {
					result = -1;
				}
				else {
					int quo = num /100;
					result = (quo + 1) * 100;
				}
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(getNextMultipleOf100(sr.nextInt()));
			
		}
}
