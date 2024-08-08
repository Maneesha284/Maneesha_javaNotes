package student;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		
		System.out.println("Enter sid, name, exam fee");
		Student  student = new Student(sr.nextInt(),sr.next(),sr.nextDouble());
		DayScholar dayScholar = new DayScholar(sr.nextInt(),sr.next(),sr.nextDouble(),sr.nextDouble());
		Hosteller hosteller = new Hosteller(sr.nextInt(),sr.next(),sr.nextDouble(),sr.nextDouble());
		
		System.out.println("Select one either DayScholar and Hosteller");
		System.out.println("1.DayScholar \n 2.Hosteller \n 3.exit");
		switch(sr.nextInt()) {
		case 1: 
			System.out.println("Enter amount how much you are paying");
			System.out.println("Balance = " + dayScholar.payFee(sr.nextInt()));
			System.out.println(dayScholar.displayDetails());
			break;
		case 2: 
			System.out.println("Enter amount how much you are paying");
			System.out.println("Balance = " + hosteller.payFee(sr.nextInt()));
			System.out.println(dayScholar.displayDetails());
			break;
		case 3: 
			System.exit(0);
		}
		System.out.println();
		
		
	}

}
