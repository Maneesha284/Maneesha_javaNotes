import java.util.Scanner;

public class Dominios {
	private static int cost(int num) {
		int eachOne = 300;
		int price = num * eachOne;
		int discount = (price * 20) / 100;
		int totalCost = price - discount;
		return totalCost;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter number of pizzas for order: ");
		int num = sr.nextInt();
		System.out.println("Total Amount:  " + cost(num));
	}

}
