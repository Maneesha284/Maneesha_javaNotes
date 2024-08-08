import java.util.Scanner;

public class GeneratePalindrome {
	static String result = "";
	public static String getPalindromeList(int num) {
		String rev1 = "";
		if (num < 0 || num == 0) {
			result = "Error";
		} 
		else {
	
			int x, rem, rev = 0, sum;
			x = num;
			result += x;
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			if (rev == x)
				return result;
			result = result + " " + rev + " ";
			sum = x + rev;
			result += sum +" ";
			return getPalindromeList(sum);
		}
		return rev1;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any Numer");
		int num = sr.nextInt();
		System.out.print(getPalindromeList(num));
	}

}
