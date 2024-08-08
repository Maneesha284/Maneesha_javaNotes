import java.util.Scanner;

public class SwappingWithOutTemp {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter two values");
		int value1 = sr.nextInt();
		int value2 = sr.nextInt();
		
		System.out.println("Before swapping value1: " +value1 +" value2: " +value2);
		
		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		
		System.out.println("After swapping value1: " +value1 +" value2: " +value2);
		

	}

}
