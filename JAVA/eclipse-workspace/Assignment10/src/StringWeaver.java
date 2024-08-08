import java.util.Scanner;

public class StringWeaver {
	static String getWeavedString(String str1, String str2) {
		String result = "";
		int len1 = str1.length();
		int len2 = str2.length();
		if (str1.isBlank() || str2.isBlank()) {
			result += -1;
		} 
		else if (len1 > len2) {
			result += str2 + str1 + str2;

		}
		else if (len1 < len2) {
			result += str1 + str2 + str1;

		} 
		else if (len1 == len2) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			for (int i = 0; i < len1; i++) {
				result = result + ch1[i] + ch2[i];
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any two strings");
		String str1 = sr.next();
		String str2 = sr.next();
		System.out.println(getWeavedString(str1, str2));
	}

}
