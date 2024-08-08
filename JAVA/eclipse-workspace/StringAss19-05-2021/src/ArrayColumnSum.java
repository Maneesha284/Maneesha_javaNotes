import java.util.Scanner;

public class ArrayColumnSum {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		System.out.println("Enter elementa into an array");
		Scanner sr = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = sr.nextInt();
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();

		}
		System.out.println("");
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (j == 0) {
					sum1 += arr[i][j];
				} else if (j == 1) {
					sum2 += arr[i][j];
				} else if (j == 2) {
					sum3 += arr[i][j];
				}

			}

		}
		System.out.println("Fisrt column sum:	"+sum1);
		System.out.println("Second column sum:	"+sum2);
		System.out.println("Third column sum:	"+sum3);
	}

}
