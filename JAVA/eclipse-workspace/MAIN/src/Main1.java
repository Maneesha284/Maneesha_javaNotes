import java.util.Scanner;

public class Main1 {
	static int size = 0;
	static int[] sumNum(int[] arr) {
		int sum = 0;
		int result[] = new int[arr.length];
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					result[size] = sum + arr[j];
					size++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int sizeOfArray = sr.nextInt();
		int arr[] = new int[sizeOfArray];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		
		
		int output[] = sumNum(arr);
		
		System.out.println("ouput of an array: ");
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
