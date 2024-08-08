import java.util.Scanner;

public class AlarmClock {
	static String ringAlarm(int num, boolean b) {
		String result = "";
		if(num >= 0 && num <= 6 || b == true || b == false) {
			if((num >= 1 && num <= 5) && (b == true))
				result = "10:00";
			else if((num >= 1 && num <= 5) && (b == false))
				result = "7:00";
			else if((num == 0 ||num == 6) && (b == true))
				result = "off";
		}
		else {
			result = "Invalid Inputs";
		}
		return result;
	}
	public static void main(String s[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter number and boolean value:");
		System.out.println(ringAlarm(sr.nextInt(), sr.nextBoolean()));
	}
}
