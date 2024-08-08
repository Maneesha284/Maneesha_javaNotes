import java.util.Scanner;

public class FizzBizz {
	static String getFizzBizz(int num) {
		String result =  "";
		if(num < 0 || num == 0) {
			System.out.println("Error");
		}
		else {
			if(num % 3 == 0 && num % 5 == 0)
				result ="FizzBizz";
			else if(num % 3 == 0)
				result= "Fizz";
			else if(num % 5 == 0)
				result= "BIZZ";
			else
				result= null;
		}
		return result;
	}
	public static void main(String[] args) {
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter input value");
			int num = sr.nextInt();
			
			System.out.println(getFizzBizz(num));
			

	}

}
