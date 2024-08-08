import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter some value");
		int value = sr.nextInt();
		
		if(value < 0) 
			value = -( value );
		else
			value = value;
		
		System.out.println("The given absolute value: " +value);
	}

}
