package com.exception.stackoverflow;

import java.util.*;

public class Example1 {
//	static int i=0;
//	public static void main(String[] args) {
//		
//		System.out.println("main");
//		if(i==10) {
//			Example1.m1(i);
//		}
//	}
//	public static void m1(int i) {
//		System.out.println("method "+i);
//	
//		m1(i);
//	}
	public static void main(String[] args) {
//		List l=new ArrayList();
//		l.add(10);
//		l.add(20);
//		l.add(20);
//		l.add(10);
//		l.add(10);
//		Set s=new HashSet(l);
//		System.out.println(s);
		
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(40);
		List l=new ArrayList(s);
		System.out.println(l);

		
//		Iterator iterator = s.iterator();
//		while(iterator.hasNext()) {
//			Object next = iterator.next();
//			System.out.println(next);
//		}
	}
}
