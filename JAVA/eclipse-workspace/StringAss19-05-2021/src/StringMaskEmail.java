import java.util.Scanner;

public class StringMaskEmail {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any String:");
		String str = sr.next();
		char ch[] = str.toCharArray();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (i == 0 || i == 1) {
				ch[i] = ch[i];
			} 
			else if (ch[i] == '@') {
				ch[i] = '@';
				break;
			} 
			else {
				ch[i] = 'X';
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(ch[i]);
		}

	}

}
