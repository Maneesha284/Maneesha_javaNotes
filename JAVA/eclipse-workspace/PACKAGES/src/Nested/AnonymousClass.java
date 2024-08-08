package Nested;
interface Add {
	void sum(int a, int b);
}
public class AnonymousClass {

	public static void main(String[] args) {
		Add obj = new Add() {
			public void sum(int a, int b) {
				System.out.println(a+b);
			}
		};
		obj.sum(10,20);
	}

}
