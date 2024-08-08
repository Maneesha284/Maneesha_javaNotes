import java.util.Scanner;

public class SearchElement {
	
	static Scanner sr = new Scanner(System.in);
	static String searchingElement(int[] arr) {
		
		String result = "";
		System.out.println("Enter searching element");
		int se = sr.nextInt();
		
		boolean b = false;
		int i = 0;
		
		for(; i < arr.length; i++) {
			
			if(arr[i] == se) {
				b = true;
				break;
			}
			else {
				b = false;
			}
			
		}
		
		if(b == true) {
			result += se +" element is found at " + i +" position";
		}
		else {
			result += se +" element is not found";
		}
		
		return  result;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sr.nextInt();
		}
		
		System.out.println(searchingElement(arr));
		
	}
}
