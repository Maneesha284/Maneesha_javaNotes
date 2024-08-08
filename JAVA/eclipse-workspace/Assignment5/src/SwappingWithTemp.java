import java.util.Scanner;

public class SwappingWithTemp {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter two values");
		int value1 = sr.nextInt();
		int value2 = sr.nextInt();
		
		System.out.println("Before swapping value1: " +value1 +" value2: " +value2);
		
		int temp = value1;
		value1 = value2;
		value2 =temp;
		
		System.out.println("After swapping value1: " +value1 +" value2: " +value2);
		
	}
}
