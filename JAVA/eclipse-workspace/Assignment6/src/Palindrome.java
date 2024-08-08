import java.util.Scanner;

public class Palindrome {

		static int isPalindrome(int num) {
				int result = 0;
				
				int count = 0;
				int temp = num;
				while(temp != 0) {
					temp = temp / 10;
					count++;
				}
				
				if(num < 0 || num == 0) {
					result = -1;
				}
				else if(count != 3) {
					result = -2;
				}
				else {
					int rev = 0;
					int temp1 = num;
					while(temp1 > 0) {
						int rem = temp1 % 10;
						rev = (rev * 10) + rem; 
						temp1 = temp1 / 10;
					}
					if(rev == num)
						result = 1;
					else
						result = 0;
				}
				
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any number:");
			System.out.println(isPalindrome(sr.nextInt()));
			
		}
}
