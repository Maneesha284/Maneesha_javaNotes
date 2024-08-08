import java.util.Scanner;

public class Hotel {
	static Scanner sr = new Scanner(System.in);
	void idly() {
		int idly_price = 50;
		int idly_bill = 0;
		int total_bill = 0;
		System.out.println("How many plates do you want");
		int plate = sr.nextInt();
		idly_bill=idly_price*plate;
		System.out.println(plate+" plates idly bill: "+idly_bill);
	}
	private static String foodOrder(int ch) {
		String result = "";
		switch (ch) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			System.exit(0);
		default:
			result = "Wrong choice";
		}
		return result;
	}

	public static void main(String[] args) {
		String menu = "MENU DRIVEN APPLICATION \n";
		menu += " 1.Idly \n";
		menu += " 2.Dosa \n";
		menu += " 3.puri \n";
		menu += " 4.Exit \n";
		menu += "Enter your choice: ";
		System.out.println(menu);
		int ch = sr.nextInt();
		System.out.println(foodOrder(ch));
	}

}
