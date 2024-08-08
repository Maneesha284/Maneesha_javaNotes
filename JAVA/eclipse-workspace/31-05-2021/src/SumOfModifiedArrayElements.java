import java.util.Scanner;

public class SumOfModifiedArrayElements {

	static int[] getSumOfModifiedElements(int[] arr) {
		int result[] = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[i] = (arr[i] * 2);

			} else {
				result[i] = temp;
				temp++;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sr.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				sum = -1;
				
				break;
			} 
			else if (arr[i] < 0) {
				sum = -2;
				
				break;
			}
			else if (arr[i] == 0) {
				sum = -3;
				
				break;
			}
			else {
				arr = getSumOfModifiedElements(arr);
				break;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println("\nSum Of Modified Array Elements: " + sum);
		

	}
}
