package Nested;

public class StaticClass {
	static class Inner{
		static void display() {
			System.out.println("Static inner Class ");
		}
	}
	public static void main(String[] args) {
		StaticClass.Inner.display();

	}
}
