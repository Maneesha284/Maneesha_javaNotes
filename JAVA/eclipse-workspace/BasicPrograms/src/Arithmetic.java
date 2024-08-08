import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		String menu = "MENU DRIVEN APPLICATION \n";
		menu += " 1.Add \n";
		menu += " 2.Sub \n";
		menu += " 3.Mul \n";
		menu += " 4.Div \n";
		menu += " 5.Exit \n";
		menu += "Enter your choice: ";
		System.out.println(menu);
		int ch = sr.nextInt();
		String result = ""; 
		switch(ch) {
			case 1:
				System.out.println("Enter any two numbers:");
					result = "Sum: " +(sr.nextInt() + sr.nextInt());
					break;
			case 2:
				System.out.println("Enter any two numbers:");
					result = "Sub: " +(sr.nextInt() - sr.nextInt());
					break;
			case 3:
				System.out.println("Enter any two numbers:");
					result = "Mul: " +(sr.nextInt() * sr.nextInt());
					break;
			case 4:
				System.out.println("Enter any two numbers:");
					result = "Div: " +(sr.nextInt() / sr.nextInt());
					break;
			case 5:
				System.exit(0);
			default:
				result = "Wrong choice";
		}
		System.out.println(result);
	}

}
