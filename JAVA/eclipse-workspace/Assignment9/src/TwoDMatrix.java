import java.util.Scanner;

public class TwoDMatrix {
	static int[][] sum(int[][] a, int[][] b) {
		int result[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	static int[][] sub(int[][] a, int[][] b) {
		int result[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}
	static int[][] mul(int[][] a, int[][] b) {
		int result[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result[i][j] = a[i][j] * b[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int a[][] = {{1,2},{3,4}};
	    int b[][] = {{2,2},{1,4}};
	    System.out.println("Enter elements in a array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <2; j++) {
				a[i][j] = sr.nextInt();
			}
		}
		System.out.println("Enter elements in b array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = sr.nextInt();
			}
		}
		if(a.length==b.length) {
			System.out.println("Sum of 2 matrix");
			int sum[][] = sum(a, b);
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Subtraction of 2 matrix");
			int sub[][] = sub(a, b);
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(sub[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Multiplication of 2 matrix");
			int mul[][] = mul(a, b);
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(mul[i][j] + " ");
				}
				System.out.println();
			}

		}
		else {
			System.out.print("Not possible Addition Of Two arrays ");
		}
	}

}
