import java.util.Scanner;

public class ValidateTime {
	static boolean isValidTime(String time) {
		boolean b = false;
		String[] str = time.split(":");
		for(int i=0;i<str.length;i++) {
			int no1 = Integer.valueOf(str[0]);
			int no2 = Integer.valueOf(str[1]);
			int no3 = Integer.valueOf(str[2]);
			if((no1 >= 00 && no1 <= 24)&& (no2 >= 00 && no2 <= 59) && (no3 >= 00 && no3 <= 59)) {
				b = true;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String time = sr.next();
		System.out.println(isValidTime(time));
	}

}
