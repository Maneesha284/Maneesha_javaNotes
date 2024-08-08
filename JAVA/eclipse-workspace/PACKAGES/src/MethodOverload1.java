
public class MethodOverload1 {
	void sum() {
		System.out.println("Welcome");
	}

	void sum(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	double sum(double a, double b, double c) {
		return a + b + c;
	}

	String sum(String s1, String s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {
		MethodOverload1 obj = new MethodOverload1();
		obj.sum();
		obj.sum(10, 20);
		System.out.println("sum: " + obj.sum(1.3, 2.4, 3.6));
		System.out.println("sum: " + obj.sum("hello", "world"));

	}

}
