import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sr.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		System.out.println("Enter array location and value");
		int loc = sr.nextInt();
		int value = sr.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(i<loc) {
				arr[i]=arr[i];
			}
			else if (i == loc) {
				arr[i]=value;
				i++;
			}
			else {
				arr[i]=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}

}