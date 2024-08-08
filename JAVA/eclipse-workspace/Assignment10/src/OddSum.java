import java.util.Scanner;

public class OddSum {
	static int getOddCount(int[] arr) {
		int result = 0;
		
		if (arr.length != 5) {
			result = -1;
		} 
		else if((arr[0] <= 0) ||(arr[1] <= 0) ||(arr[2] <= 0) ||(arr[3] <= 0) ||(arr[4] <= 0) ) {
			result = -2;
		}
		else {
			int count = 0, flag = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 != 0) {
					result += arr[i];
				}
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
		System.out.print("Sum of Array elements: " + getOddCount(arr));

	}

}
