import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		long time =System.currentTimeMillis();
		java.sql.Date d1=new java.sql.Date(time);
		System.out.println(d1);

	}

}
