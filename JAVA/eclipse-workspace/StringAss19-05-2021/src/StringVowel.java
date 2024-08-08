import java.util.Scanner;

public class StringVowel {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any String:");
		String str = sr.next().toLowerCase();
		char ch[] = str.toCharArray();
		int len = str.length();
		System.out.println("Vowels in the given string");
		for (int i = 0; i < len; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ) {
				System.out.print(ch[i] + " ");
			}
		}

	}

}
