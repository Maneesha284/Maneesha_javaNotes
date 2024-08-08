public class Multiple {
	public int mul(int no) {
		int i = no / 100;
		int multiple = (i + 1) * 100;
		return multiple;
	}
	public static void main(String s[]) {
		Multiple m1 = new Multiple();
		System.out.println(m1.mul(Integer.parseInt(s[0])));
	}
}
