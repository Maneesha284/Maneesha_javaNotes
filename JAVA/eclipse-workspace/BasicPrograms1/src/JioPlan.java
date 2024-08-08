import java.util.Scanner;

public class JioPlan{
	private static int cost(int num) {
		int gst = 18;
		int discount = (num * gst) / 100;
		int totalCost = num + discount;
		return totalCost;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter amount for jio plan: ");
		int num = sr.nextInt();
		System.out.println("Total Amount:  " + cost(num));
	}

}
