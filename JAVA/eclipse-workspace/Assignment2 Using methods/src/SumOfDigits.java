public class SumOfDigits {
	public int sum(int no) {
		int i = no / 10;
		int j = no % 10;
		return i + j;
	}
	public static void main(String s[]) {
		SumOfDigits so = new SumOfDigits();
		int no = Integer.parseInt(s[0]);
		System.out.println(so.sum(no));
	}

}
