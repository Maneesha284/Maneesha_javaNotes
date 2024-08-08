import java.util.Scanner;

public class SortArray {
	
	static Scanner sr = new Scanner(System.in);
	static int[] sortElementst(int[] sort) {
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < sort.length; i++) {
			sort[i] = sr.nextInt();
		}
		
		for(int i = 0; i < sort.length; i++) {
			
			for(int j = i; j < sort.length; j++) {
				
				if(sort[i] >= sort[j]) {
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
				
			}
			
		}
		return sort;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter elements in array");
		int size = sr.nextInt();
		
		int sort[] = new int[size];
		sort = sortElementst(new int[sort.length]);
		
		System.out.println("After Sorting element in array: ");
		for(int i = 0; i < sort.length; i++) {
			System.out.println(sort[i]);
		}
	}
	
}
