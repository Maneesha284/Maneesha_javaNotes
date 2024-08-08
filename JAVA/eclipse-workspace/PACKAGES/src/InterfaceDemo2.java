interface SumOperator {
	void sum(int a, int b);
}

interface SubOperator extends SumOperator {
	void sub(int a, int b);
}

public class InterfaceDemo2 implements SubOperator {

	public static void main(String[] args) {
		InterfaceDemo2 obj = new InterfaceDemo2();
		obj.sum(20, 10);
		obj.sub(20, 10);

	}

	public void sum(int a, int b) {
		System.out.println("sum = " + (a + b));

	}

	public void sub(int a, int b) {
		System.out.println("sub = " + (a - b));

	}

}
