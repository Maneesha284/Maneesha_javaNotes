import java.util.Scanner;

public class SumOfArray {
	static int sumOfArray(int[] arr) {
		int result = 0;
		
		if (arr.length == 0) {
			result = -1;
		} 
		else {
			for (int i = 0; i < arr.length; i++) {
				result = result + arr[i];
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter elements in a array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		System.out.print("Sum of Array elements: " + sumOfArray(arr));

	}

}
