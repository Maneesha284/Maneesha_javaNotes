import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		long l =System.currentTimeMillis();
		java.sql.Date d1=new java.sql.Date(1);
		System.out.println(d1);
		
		LocalDate date =LocalDate.now();
		System.out.println(date);
		LocalDate yesterday =date.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate tommorow =date.plusDays(1);
		System.out.println(tommorow);
		
		Calendar c= Calendar.getInstance();
		Date dd=c.getTime();
		System.out.println(dd);
		c.add(Calendar.DATE, -5);
		System.out.println("5 days ago  "+c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));
	}

}
