package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListSet {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(32);
		a.add(234);
		a.add(63);
		a.add(34);
		a.add(78);
		a.add(63);
		a.add(34);
		System.out.println(a);
		
		Set s=new HashSet(a);
		System.out.println(s);

	}

}
