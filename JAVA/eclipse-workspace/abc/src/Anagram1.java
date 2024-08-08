import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String output = "";
		int flag = 0;
		System.out.println("Enter str1:");
		String str1 = sr.next();

		System.out.println("Enter str2:");
		String str2 = sr.next();

		if (str1.length() != str2.length()) {
			output = "your string is not an Anagram len";
		}
		if (output.isBlank()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			for (int i = 0; i < str1.length(); i++) {
				int count = 0;
				for (int j = 0; j < str2.length(); j++) {
					if (ch1[i] == ch2[j]) {
						count++;
					}
				}
				if (count == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				output = "your string is not an Anagram m";
			} else {
				output = "your string is an Anagram";
			}
		}
		System.out.println(output);

	}

}
