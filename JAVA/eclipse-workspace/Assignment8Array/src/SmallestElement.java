import java.util.Scanner;

public class SmallestElement {
	
	static int smallElement(int[] small) {
		
		for(int i = 0; i < small.length; i++) {
			
			for(int j = i; j < small.length; j++) {
				
				if(small[i] >= small[j]) {
					int temp = small[i];
					small[i] = small[j];
					small[j] = temp;
				}
				
			}
			
		}
		
		return  small[0];
	}
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter elements in array");
		int size = sr.nextInt();
		
		int small[] = new int[size];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < small.length; i++) {
			small[i] = sr.nextInt();
		}
		
		System.out.println("The Biggest element in array: " +smallElement(small));
		
	}
}
