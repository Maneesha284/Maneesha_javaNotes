import java.util.Scanner;

public class FizzBizz {
	public static String getOutputString(int no) {
		if(no % 3 == 0 && no % 5 == 0)
			return "FizzBizz";
		else if(no % 3 == 0)
			return "Fizz";
		else if(no % 5 == 0)
			return "BIZZ";
		else
			return null;
	}
	public static void main(String[] args) {
		try {
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter input value");
			int no = sr.nextInt();
			if(no < 0) {
				System.out.println("Error");
			}
			else {
				System.out.println(getOutputString(no));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
