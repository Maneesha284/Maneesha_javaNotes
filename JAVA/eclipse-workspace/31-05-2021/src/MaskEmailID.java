import java.util.Scanner;

public class MaskEmailID {
	static String maskMailID(String mail) {
		char ch[] = mail.toCharArray();
		int len = mail.length();
		String result = "";
		if (mail.equalsIgnoreCase(mail) && mail.endsWith("@gmail.com")  ) {
			for (int i = 0; i < len; i++) {
				if (i == 0 || i == 1) {
					ch[i] = ch[i];
				} else if (ch[i] == '@') {
					ch[i] = '@';
					break;
				} else {
					ch[i] = 'X';
				}
			}
			for (int i = 0; i < len; i++) {
				System.out.print(ch[i]);
			}
			return result;
		}

		else {
			result = "Invalid";
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String mail = sr.next();
		System.out.println(maskMailID(mail));

	}

}
