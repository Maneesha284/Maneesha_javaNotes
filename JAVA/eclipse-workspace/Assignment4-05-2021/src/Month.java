import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		
		System.out.println("Enter any Character: ");
		String str = sr.next().toUpperCase().substring(0, 3);
		String result = ""; 
		switch(str) {
				case "JAN":
				case "MAR":
				case "MAY":
				case "JUL":
				case "AUG":
				case "OCT":
				case "DEC":
					result = str + " has 31 days";
					break;
				case "FEB":
					result = str + " has 28 days";
					break;
				case "APR":
				case "JUN":
				case "SEP":
				case "NOV":
					result = str + " has 30 days";
					break;
				default :
					result = str + " is not a month";
			}
			System.out.println(result);
	}

}
