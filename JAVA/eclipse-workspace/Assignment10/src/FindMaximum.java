import java.util.Scanner;

public class FindMaximum {
	static int findMax(int[] arr) {
		int result = 0;
		
		if (arr.length == 0) {
			result = -1;
		} 
		else {
			int temp =0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] < arr[i+1]) {
						arr[i] = temp;
						arr[i] = arr[i+1];
						temp = arr[i+1];
						
					}
				}
			}
			result = temp;
			

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
		System.out.print("Sum of Array elements: " + findMax(arr));

	}

}
