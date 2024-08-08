import java.util.Scanner;

public class OccuranceCounter {
	static int getCount(int arr[], int num) {
		int count = 0;
		if (arr.length == 0) {
			count = -1;
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == num)
					count++;
			}
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter elements in a array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		System.out.println("Enter any number");
		int num = sr.nextInt();
		
		System.out.println("The given element is occured "+getCount(arr, num) +" times");

	}

}
