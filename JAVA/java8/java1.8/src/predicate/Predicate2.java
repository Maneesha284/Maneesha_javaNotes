package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String adharnum = sc.next();
		
		Predicate<Integer> p1 =num -> num ==  12 ;
		System.out.println(p1.test(adharnum.length()));
	}

}
