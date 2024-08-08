import java.util.Scanner;

public class RightDiagonalSum {
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
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if ((i == 0 && j==2)||(i == 1 && j==1)||(i == 2 && j==0)) {
					sum += arr[i][j];
				} 
			}

		}
		System.out.println("Left Diagonal sum:	"+sum);
	}

}
