import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 DateFormat - > SimpleDateFormat
 It is providing various methods to format and parse the date and time
 Formatting: converting date to string
 Parsing: Converting String to date
*/
public class DateDemo1 {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdf.format(d);
		System.out.println(date);
		
		try {
			SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
			Date date1=sdf1.parse("19/06/2021");
			System.out.println(date1);
		}
		catch(ParseException e) {
			System.out.println(e);
		}

	}

}
