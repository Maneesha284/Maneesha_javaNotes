package Nested;

interface Addition {
	void sum(int a, int b);

	default void display() {
		System.out.println("");
	}

	static void display1() {
		System.out.println("");
	}
}

public class AnonymousClass1 {

	public static void main(String[] args) {
		Addition obj = new Addition() {
			public void sum(int a, int b) {
				System.out.println("");
			}			
		};
		obj.sum(10, 10);
		obj.display();
		Addition.display1();
	}

}
