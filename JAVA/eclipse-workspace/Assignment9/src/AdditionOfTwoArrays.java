import java.util.Scanner;

public class AdditionOfTwoArrays {
	static int[] sum(int[] a, int[] b) {
		int result[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] + b[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		System.out.println("Enter elements in a array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}
		System.out.println("Enter elements in b array");
		for (int i = 0; i < b.length; i++) {
			b[i] = sr.nextInt();
		}
		if(a.length==b.length) {
			int sum[] = sum(a, b);
			for (int i = 0; i < sum.length; i++) {
				System.out.print(sum[i] + " ");
			}
		}
		else {
			System.out.print("Not possible Addition Of Two arrays ");
		}

	}

}
