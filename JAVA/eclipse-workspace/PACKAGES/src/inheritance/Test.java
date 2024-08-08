package inheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter sno, name, three subject marks");
		Scanner sr=new Scanner(System.in);
		Marks obj = new Marks(sr.nextInt(), sr.next(), sr.nextInt(),sr.nextInt(),sr.nextInt());
		obj.displayStudent();
	}

}
