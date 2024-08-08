import java.util.Scanner;

public class BiggestElement {
	
	static int bigElement(int[] big) {
		
		for(int i = 0; i < big.length; i++) {
			
			for(int j = i; j < big.length; j++) {
				
				if(big[i] >= big[j]) {
					int temp = big[i];
					big[i] = big[j];
					big[j] = temp;
				}
				
			}
			
		}
		
		return  big[big.length -1];
	}
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		int big[] = new int[10];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < big.length; i++) {
			big[i] = sr.nextInt();
		}
		
		System.out.println("The Biggest element in array: " +bigElement(big));
		
	}
}
