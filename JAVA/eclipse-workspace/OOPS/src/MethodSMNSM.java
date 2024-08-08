
public class MethodSMNSM {
	static int firstNum = 10;
	int secNum = 20;

	void sum() {
		System.out.println("sum=" + (firstNum + secNum));
	}

	static void product() {
		// System.out.println("product="+(firstNum+secNum));
		System.out.println("product=" + (firstNum + firstNum));
	}

	public static void main(String[] args) {
		MethodSMNSM.product();
		product();
		MethodSMNSM obj = new MethodSMNSM();
		obj.product();
		obj.sum();

	}

}
