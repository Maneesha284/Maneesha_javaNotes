import java.util.Scanner;

public class ValidateEmailID {
	static String isValidMailID(String mail) {
		String result = "";
		
		if(mail.charAt(0) >= 97 && mail.charAt(0) <=122) {
			result = "valid";
		}
		else {
			result = "-1";
		}
		
		char ch[]=mail.toCharArray();
		int count = 0;
		for(int i=0;i<mail.length();i++) {
			if(ch[i] == '@') {
				count++;
			}
		}
		if(count == 0) {
			result = "-2";
		}
		else if(count != 1) {
			result = "-3";
		}
		else {
			result = "valid";
		}
		if((mail.endsWith(".com")) || (mail.endsWith(".co.in"))) {
			result = "valid";
		}
		else {
			result = "-4";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String mail = sr.next();
		System.out.println(isValidMailID(mail));
	}

}
