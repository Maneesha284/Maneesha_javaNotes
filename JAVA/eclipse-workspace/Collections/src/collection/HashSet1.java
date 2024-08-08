package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		hs.add("c");
		hs.add("d");
		System.out.println(hs.add("d"));
		System.out.println(hs.add("d"));
		System.out.println(hs);
		System.out.println("===========================");
		HashSet<String> hs1 =new HashSet<String>();
		hs1.add("C");
		hs1.add("D");
		hs1.add("B");
		hs1.add("A");
		Iterator<String> i=hs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
