import java.util.Scanner;

public class EvenNumber {
	
	static int size = 0;
	static int[] evenNum(int[] even) {
		
		int result[] = new int[even.length];
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < even.length; i++) {
			even[i] = sr.nextInt();
		}
		for(int i = 0; i < even.length; i++) {
			
			if(even[i] % 2 == 0) {
				result[size]  = even[i];
				size++;
			}
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int even[] = new int[10];
		
		even = evenNum(new int[even.length]);
		
		System.out.println("The Biggest element in array: ");
		for(int i = 0; i < size; i++) {
			System.out.println(even[i]);
		}
		
	}
}
