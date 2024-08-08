package predicate;

import java.util.function.Predicate;

public class Predicate4 {

	public static void main(String[] args) {
		int x[] = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The numbers greater than 10");
		m1(p1, x);
		System.out.println("The even numbers");
		m1(p2, x);
		System.out.println("The numbers not greater than 10");
		m1(p1.negate(), x);
		System.out.println("The numbers greater than 10 & even numbers");
		m1(p1.and(p2), x);
		System.out.println("The numbers greater than 10 || even numbers");
		m1(p1.or(p2), x);
	}
	public static void m1(Predicate<Integer> p, int x[]) {
		for (int m : x) {
			if (p.test(m)) {
				System.out.println(m);
			}
		}
	}
}
