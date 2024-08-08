import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = sr.nextInt();
		String result = ""; 
		
		if(num % 2 == 0) 
			result = num + " is Even number";
		else
			result = num + " is Odd number";
		
		System.out.println(result);
		

	}

}
