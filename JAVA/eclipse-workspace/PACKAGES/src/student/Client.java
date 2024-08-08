package student;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter sno, sname, hno, clonyname, cityname");
		int sno = sr.nextInt();
		String sname = sr.next();
		String hno = sr.next();
		String colname = sr.next();
		String cityname = sr.next();
		
		Address address = new Address(hno,colname,cityname);
		Student s = new Student(sno,sname,address);
		System.out.println(s);
		

	}

}
