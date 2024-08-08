import java.util.Scanner;

public class EvenNumbersSumFromArray {

	static int size = 0;
	static int sum = 0;

	static int getSumOfEvenNumbers(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];

			}
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		for (int i = 0; i <= arr.length; i++) {
			if(arr.length == 0) {
				sum = -3;
				break;
			}
			else if(arr[i] == 0) {
				sum = -2;
				break;
			}
			else if(arr[i] < 0) {
				sum = -1;
				break;
			}
			
			else {
				System.out.println("The Sum Of Even Numbers in array: " + getSumOfEvenNumbers(arr));

			}

		}
		
	}
}
