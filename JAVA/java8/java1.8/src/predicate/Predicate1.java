package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		Predicate<Integer> p=num->(num>18);
		if(p.test(age))
			System.out.println("valid");
		else
			System.out.println("invalid");
	}

}
