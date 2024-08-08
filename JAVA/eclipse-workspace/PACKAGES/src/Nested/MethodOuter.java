package Nested;

public class MethodOuter {
	void display() {
		System.out.println("inner method ");
		class Inner {
			void wish() {
				System.out.println("inner method class ");
			}
		}
		Inner obj = new Inner();
		obj.wish();
	}
	public static void main(String[] args) {
		MethodOuter obj = new MethodOuter();
		obj.display();

	}

}
