
public class NoOfArgs {
	public static void display(int... num) {
		System.out.println("Array size:  " + num.length);
		for (int i : num)
			System.out.println(i);
	}
	public static void main(String[] args) {
		display(1, 2, 3, 4, 5, 6, 7, 8);
		display(10, 20, 30, 40);
		display(25, 43, 44);
	}
	
}
