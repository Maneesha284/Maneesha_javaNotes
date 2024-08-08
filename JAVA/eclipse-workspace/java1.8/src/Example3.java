
//Reference to an instance method
interface calculator {
	void sum(int a, int b);
}

public class Example3 {
	void saySum1(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	public static void main(String[] args) {
		Example3 obj = new Example3();
		calculator obj1 = obj::saySum1;
		obj1.sum(10, 20);

	}

}
