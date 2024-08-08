import java.util.Scanner;

public class InsertionSort1 {
	//value:	5  	2	4	6	1	3
	//index:	0	1	2	3	4	5
	
	//value:	2  	5	4	6	1	3
	//index:	0	1	2	3	4	5
	private static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			for (int j = i - 1; j >= 0 ; j--) {
				if(arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					
				}
				

			}

		}
		return arr;

	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sr.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements into an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}

		arr = insertionSort(arr);

		System.out.println("After Sorting element in array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
