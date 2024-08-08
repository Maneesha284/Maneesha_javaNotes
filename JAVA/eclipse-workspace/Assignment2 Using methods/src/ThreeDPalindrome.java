
public class ThreeDPalindrome {
	String s1;
	String s2 = "";
	public boolean palindrome() {
		int len = s1.length();
		s2 = s2 + s1.charAt(len - 1) + s1.charAt(len - 2) + s1.charAt(len - 3);
		boolean b1 = s2.equals(s1);
		return b1;
	}
	public static void main(String s[]) {
		ThreeDPalindrome p1 = new ThreeDPalindrome();
		p1.s1 = s[0];
		p1.s2 = "";
		System.out.println(p1.palindrome());
	}
}
