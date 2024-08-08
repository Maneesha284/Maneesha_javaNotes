import java.util.Scanner;

public class FillMuliples {
	static int[] fillMultiples(int[] arr) {

		int[] result = new int[arr.length];
		int mul = 1;

		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i] * mul;
			mul++;
		}
		return result;
	}

	public static void main(String[] args) {

		int arr[] = new int[10];
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter elements in a array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		arr = fillMultiples(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
