package java8;
interface Add{
	void sum(int a, int b);
}
public class FunctionalInterface {
	
	Add obj = (x,y) -> {	//one way 
		System.out.println("sum: "+(x+y));
	};
	void display() {
		obj.sum(10, 20);
	}
	public static void main(String[] args) {
		FunctionalInterface obj = new FunctionalInterface();
		obj.display();
	}

	/*public static void main(String[] args) {	//second way
		Add obj = (x,y) -> {
			System.out.println("sum: "+(x+y));
		};
		obj.sum(10, 20);
	}*/

}
