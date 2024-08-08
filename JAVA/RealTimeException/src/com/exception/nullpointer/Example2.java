package com.exception.nullpointer;

import java.util.Optional;

public class Example2 {

	public static void main(String[] args) {
//		String[] s=new String[10];
//		String lower=s[5].toLowerCase();
//		System.out.println(lower);
		
		String s1=new String("Fgfhgfhfg");
		
		char[] ch = s1.toCharArray();
		Optional<Character> s=Optional.ofNullable(ch[13]);
		if(s.isPresent()) {
			System.out.println("String value is present");
		}
		else {
			System.out.println("String value is not present");
		}
		
		
	}

}
