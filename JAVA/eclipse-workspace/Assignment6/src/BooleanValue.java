import java.util.Scanner;

public class BooleanValue {
	static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
		boolean result = false;
		if(b1 == true && b2 == true && b3 == true)
			result = true;
		else if(b1 == true && b2 == true && b3 == false)
			result = true;
		else if(b1 == true && b2 == false && b3 == false)
			result =  false;
		else if(b1 == false && b2 == false && b3 == false)
			result =  false;
		return result;
	}
	public static void main(String s[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter three boolean values:");
		System.out.println(countBoolean(sr.nextBoolean(), sr.nextBoolean(), sr.nextBoolean()));
	}
}
