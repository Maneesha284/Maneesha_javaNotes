import java.util.Scanner;

public class Palindrome {

		static String isPalindrome(int num) {
				String result = "";
				int rev = 0;
				int temp1 = num;
				while(temp1 > 0) {
					int rem = temp1 % 10;
					rev = (rev * 10) + rem; 
					temp1 = temp1 / 10;
				}
				if(rev == num)
					result = "Given number is plaindrome";
				else
					result = "Given number is not plaindrome";
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(isPalindrome(sr.nextInt()));
			
		}
}
