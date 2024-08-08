package collection;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Scanner;
import java.util.Set;

public class SetCopy {
	public static int copySets(Set s1, Set s2) {
		int result = 0;
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i.equals(null)) {
				result = 1;
				break;
			} 
			else {
				s2.add(i);
				result = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// Scanner sr=new Scanner(System.in);
		Set<Integer> s1 = new HashSet<Integer>(8);
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		// s1.add(null);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		System.out.println("Source set:  " + s1);
		Set<Integer> s2 = new HashSet<Integer>();
		int output = copySets(s1, s2);
		if (output == 1) {
			System.out.println("null values are there in a set");
		} else {
			System.out.println("successful copied source to destinatio");
			System.out.println("Destinatio set:  " + s2);
		}
	}

}
