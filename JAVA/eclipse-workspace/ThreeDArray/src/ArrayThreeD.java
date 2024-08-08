import java.util.Scanner;

public class ArrayThreeD {

	public static void main(String[] args) {
		int college[][][] = new int[2][2][4];
		System.out.println("Enter College information");
		Scanner sr = new Scanner(System.in);
		for (int i = 0; i < college.length; i++) {
			for (int j = 0; j < college[i].length; j++) {
				System.out.println("Enter " + (i + 1) + " branch " + (j + 1) + " student " + college[i][j].length
						+ " subject marks");
				for (int k = 0; k < college[i][j].length; k++) {
					college[i][j][k] = sr.nextInt();
				}
			}
		}
		System.out.println("Student marks");
		for (int i = 0; i < college.length; i++) {
			for (int j = 0; j < college[i].length; j++) {
				for (int k = 0; k < college[i][j].length; k++) {
					System.out.print(college[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
