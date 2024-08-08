import java.util.Scanner;

public class StringEncryptes {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter any String:");
		String str = sr.next();
		char ch[] = str.toCharArray();
		int len = str.length();
		System.out.println("Encrypted in the given string");
		for (int i = 0; i < len; i++) {
			if (ch[i] == 97 || ch[i] == 98 || ch[i] == 99) {
				if(ch[i] == 97) {
					ch[i] = 120;
				}
				else if(ch[i] == 98) {
					ch[i] = 121;
				}
				else if(ch[i] == 99) {
					ch[i] = 122;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(ch[i]);
		}

	}

}
