import java.util.Scanner;

public class SumOfArrayDistinctElements {
	static int sum = 0;
	static int getSumOfDistinctElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;
					arr[j] = 0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int sizeOfArray = sr.nextInt();
		int arr[] = new int[sizeOfArray];

		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				sum = -1;
			} 
			else if (arr[i] == 0) {
				sum = -2;
			} 
			else {
				sum = getSumOfDistinctElements(arr);
				break;
			}
		}
		System.out.println(sum);

	}

}
