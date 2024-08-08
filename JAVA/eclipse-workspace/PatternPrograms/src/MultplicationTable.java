import java.util.Scanner;

public class MultplicationTable {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter range:");
		int range = sr.nextInt();
		for(int i = 1; i <= range; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println(i +" * " + j +" = " + i * j);
			}
			System.out.println("========================");

		}

	}

}
