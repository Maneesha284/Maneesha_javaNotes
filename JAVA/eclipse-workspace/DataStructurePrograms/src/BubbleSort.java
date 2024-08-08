import java.util.Scanner;

public class BubbleSort {
	
	static Scanner sr = new Scanner(System.in);
	static int[] sortElementst(int[] arr) {
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] >= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter elements in array");
		int size = sr.nextInt();
		
		int arr[] = new int[size];
		arr = sortElementst(new int[arr.length]);
		
		System.out.println("After Sorting element in array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
