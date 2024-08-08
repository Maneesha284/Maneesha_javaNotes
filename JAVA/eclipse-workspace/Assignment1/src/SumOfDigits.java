public class SumOfDigits {
	public static void main(String s[]) {
		int no = 0;
		no = Integer.parseInt(s[0]);
		int i = no / 10;
		int j = no % 10;
		System.out.println(i + j);
	}

}
