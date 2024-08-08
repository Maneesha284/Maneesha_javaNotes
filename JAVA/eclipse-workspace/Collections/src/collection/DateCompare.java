package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
	static String compareDates(String date1,String date2) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		String result="";
		Date d1=(Date)sdf.parse(date1);
		Date d2=(Date)sdf.parse(date2);
		if(d1.compareTo(d2)>0) {
			result +="1";
		}
		else if(d2.compareTo(d2)<0){
			result +="2";
		}
		else if(d1.equals(d2)) {
			result +="0";
		}
		else {
			result +="-1";
		}
		return result;
		
	}
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date1");
		String date1 =sc.next();
		System.out.println("Enter date2");
		String date2 =sc.next();
		DateCompare dc=new DateCompare();
		System.out.println(dc.compareDates(date1, date2));

	}

}

/*
 DateFormat - > SimpleDateFormat
 It is providing various methods to format and parse the date and time
 Formatting: converting date to string
 Parsing: Converting String to date
*/
