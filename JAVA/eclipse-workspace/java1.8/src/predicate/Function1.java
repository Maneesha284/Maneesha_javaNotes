package predicate;

import java.util.Scanner;
import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		Function<String,Integer> f=x->x.length();
		System.out.println("No.of characters: "+f.apply(sc.next()));

	}

}
