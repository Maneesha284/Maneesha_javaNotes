import java.util.Scanner;

public class CovertTime {
	static String isValidTime(String time) {
		String result = "";
		String[] str = time.split(":");
		for(int i=0;i<str.length;i++) {
			int no1 = Integer.valueOf(str[0]);
			int no2 = Integer.valueOf(str[1]);
			int no3 = Integer.valueOf(str[2]);
			int hours = 0;
			String min ="";
			String sec = "";
			String extension ="";
			if(no1 >= 00 && no1 <= 24) {
				hours = no1/2;
				if(no1 >= 12) {
					extension ="PM";
				}
				else {
					extension ="AM";
				}
			}
			else {
				result = "Invalid Time";
				break;
			}
			if((no2 >= 00 && no2 <= 59) && (no3 >= 00 && no3 <= 59)) {
				min  = String.valueOf(no2);
				sec  = String.valueOf(no3);
			}
			else {
				result = "Invalid Time";
				break;
			}
			
			result = String.valueOf(hours)+":"+min+":"+sec+" "+extension;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String time = sr.next();
		System.out.println(isValidTime(time));
	}

}
