import java.util.Scanner;

public class StrongNumber {

		static String isStrongNumber(int num) {
				String result = "";
				int rev = 0;
				int temp1 = num;
				while(temp1 > 0) {
					int rem = temp1 % 10;
					rev = (rev * 10) + rem; 
					temp1 = temp1 / 10;
				}
				if(rev == num)
					result = "Given number is Strong Number";
				else
					result = "Given number is not Strong Number";
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(isStrongNumber(sr.nextInt()));
			
		}
}
