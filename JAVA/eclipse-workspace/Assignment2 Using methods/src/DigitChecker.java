
public class DigitChecker {
	public int check(int no1) {
		int i = no1 / 10;
		int j = no1 % 10;
		int diff = i - j;
		return diff;
	}
	public static void main(String s[]) {
		DigitChecker d = new DigitChecker();
		int no = Integer.parseInt(s[0]);
		System.out.println(d.check(no));
	}
}
