
import java.util.Scanner;

public class NaturalNumbers {

		static String getNaturalNumbers(int num1, int num2) {
				String result = "";
				
				if(num1 < 0 || num2 < 0) {
					result = "-1";
				}
				else if(num1 == 0 || num2 == 0){
					result = "-2";
				}
				else {
					while(num1 <=  num2) {
						result += num1 + " ";		
						num1++;
					}
	
				}
				return result;
				
		}
		public static void main(String args[]) {
			
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter any two numbers:");
			System.out.println(getNaturalNumbers(sr.nextInt(), sr.nextInt()));
			
		}
}
