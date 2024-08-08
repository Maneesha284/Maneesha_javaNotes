import java.util.Scanner;

public class AssertDemo {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sr.nextInt();
		assert age >= 18 :"Invalid age";
			System.out.println("Age is valid for vote");
		

	}

}
