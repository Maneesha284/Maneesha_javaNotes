package predicate;

import java.util.function.Predicate;

public class Predicate3 {
	public boolean message(int num) {
		return false;
		
	}
	public static void main(String[] args) {
		
		Predicate<Integer> p=Predicate3::message;
		p.test(25);
	}

}
