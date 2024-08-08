package FI.Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(40);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(50);
		
		//l.forEach(num->System.out.println(num));
		l.forEach(System.out::println);
		
	}

}
