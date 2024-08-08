package filter;

import java.util.*;

public class FilterArrayList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(40);
		list.add(10);
		list.add(25);
		list.add(35);
		list.add(52);
		list.add(45);
		list.add(5);
		
//		int max1=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(max1);
		
//		List<Integer> l=list.stream().sorted().toList();
//		l.forEach(System.out::println);
		
//		List<Integer> l=list.stream().sorted(Comparator.comparing(Integer::valueOf)).toList();
//		l.forEach(System.out::println);
		
//		int min1=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(min1);
		
//		List<Integer> l2=list.stream().filter(i->i%2==0).toList();
//		l2.forEach(System.out::println);
		
		List<Integer> l3=list.stream().filter(i->(i<25)).toList();
		l3.forEach(System.out::println);

		
		
	}

}
