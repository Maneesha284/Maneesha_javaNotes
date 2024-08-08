import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {

		int sort[] = { 1, 2, 3, 4, 5 };
		int rev[] = new int[sort.length];

		System.out.println("After Reverse order in array: ");
		for (int i = sort.length - 1, j = 0; i >= 0; i--) {
			rev[j] = sort[i];
			j++;
		}
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + " ");
		}

	}
}
