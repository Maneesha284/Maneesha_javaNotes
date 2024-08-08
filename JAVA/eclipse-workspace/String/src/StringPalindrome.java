import java.util.Scanner;

public class StringPalindrome {
	static String isPalindrom(String str1) {
		String str2 = "";
		String result = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			result += str1.charAt(i);
		}
		if (result.equals(str1)) {
			str2 = str1+" Palindrome";
		} else {
			str2 = str1+" Not Palindrome";
		}
		return str2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str1 = sc.next();
		System.out.println(isPalindrom(str1));
		
		
		

	}

}
