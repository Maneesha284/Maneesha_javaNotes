import java.util.Scanner;

public class StringMaskEmail {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String extension = "@example.com";
		System.out.println("Enter any mail:");
		String str = sr.next();
		boolean b = str.endsWith(extension);
		if (b)
			System.out.println("Valid email id");
		else 
			System.out.println("Invalid email id");
	}

}
