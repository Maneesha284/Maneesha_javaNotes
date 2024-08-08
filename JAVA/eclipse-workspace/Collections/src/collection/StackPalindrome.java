package collection;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindrome {
	static boolean isPalindrome(String str) {
		boolean b=false;
		String reverse="";
		Stack s=new Stack();
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		System.out.println(s);
		int i=0;
		while(i<s.size()) {
			reverse += s.pop();
		}
		if(str.equalsIgnoreCase(reverse)) {
			b=true;
		}
		return b;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter string");
		Scanner sr=new Scanner(System.in);
		String str=sr.next();
		boolean b=isPalindrome(str);
		if(b == true)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		
		
		
	}
}
