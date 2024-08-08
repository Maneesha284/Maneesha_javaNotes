package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ListSorter {
	public static List<Integer> sortIntList(List<Integer> list) {
		Collections.sort(list);
		
		return list;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list =new ArrayList<Integer>();
		System.out.println("Enter integer values");
		for(int i=0;i<6;i++) {
			list.add(sc.nextInt());
		}
		
		List<Integer> list1= sortIntList(list);
		Iterator<Integer> i=list1.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}

	}

	

}
