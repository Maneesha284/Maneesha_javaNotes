import java.util.Scanner;

public class ArithmeticOperation {
	static Scanner sr = new Scanner(System.in);

	private static String arithmeticOperation(int ch) {
		String result = "";
		switch (ch) {
		case 1:
			System.out.println("Enter any two numbers:");
			result = "Sum: " + (sr.nextInt() + sr.nextInt());
			break;
		case 2:
			System.out.println("Enter any two numbers:");
			result = "Sub: " + (sr.nextInt() - sr.nextInt());
			break;
		case 3:
			System.out.println("Enter any two numbers:");
			result = "Mul: " + (sr.nextInt() * sr.nextInt());
			break;
		case 4:
			System.out.println("Enter any two numbers:");
			result = "Div: " + (sr.nextInt() / sr.nextInt());
			break;
		case 5:
			System.exit(0);
		default:
			result = "Wrong choice";
		}
		return result;
	}

	public static void main(String[] args) {
		String menu = "MENU DRIVEN APPLICATION \n";
		menu += " 1.Add \n";
		menu += " 2.Sub \n";
		menu += " 3.Mul \n";
		menu += " 4.Div \n";
		menu += " 5.Exit \n";
		menu += "Enter your choice: ";
		System.out.println(menu);
		System.out.println("Enter your choice");
		int ch = sr.nextInt();
		System.out.println(arithmeticOperation(ch));
	}

}
