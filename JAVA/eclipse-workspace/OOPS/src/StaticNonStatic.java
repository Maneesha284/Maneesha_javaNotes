
public class StaticNonStatic {
	static int num;
	int num1;
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(StaticNonStatic.num);

		StaticNonStatic obj = new StaticNonStatic();
		System.out.println(obj.num);

		System.out.println(obj.num1);
	}
}
