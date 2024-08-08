import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = sr.nextInt();
		String result = ""; 
		
		switch(num % 2) {
			case 0:
				result = num + " is Even number";
				break;
			case 1:
				result = num + " is Odd number";
				break;
		}
		
		System.out.println(result);
		

	}

}
