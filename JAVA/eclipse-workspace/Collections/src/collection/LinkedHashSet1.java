package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		Set<String> lhs=new LinkedHashSet<String>();
		lhs.add(null);
		lhs.add("D");
		lhs.add("D");
		lhs.add("B");
		lhs.add("D");
		lhs.add("A");
		lhs.add("C");
		lhs.add(null);
		Iterator<String> i=lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
