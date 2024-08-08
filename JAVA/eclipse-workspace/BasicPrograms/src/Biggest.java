import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		
		System.out.println("Enter your any number: ");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();
		String result = ""; 
		
		if(num1 > num2) 
			result = num1 + " is Big number";
		else if(num2 > num1) 
			result = num2 + " is Big number";
		else
			result = num1 + " and " +num2  + " are equal numbers";
		
		System.out.println(result);

	}

}
