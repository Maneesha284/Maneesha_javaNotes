
public class ThreeDPalindrome {

	public static void main(String s[]) {
		String s1 = s[0];
		String s2 = "";
		int len = s1.length();
		s2 = s2 + s1.charAt(len - 1) + s1.charAt(len - 2) + s1.charAt(len - 3);
		boolean b1 = s2.equals(s1);
		System.out.println(b1);
	}
}
