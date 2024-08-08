
import java.util.Scanner;

public class OccurrenceCounter {
	static Scanner sr = new Scanner(System.in);
	static int size, count = 0;
	public static int getCount(int[] a, int givenNumber) {
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}
		for(int i = 0; i <a.length; i++) {	
				if(a[i] == givenNumber) {
					count++;
				}
		}
		return count;
	}
	public static void main(String[] args) {
		int searchingNumber = 20; 
		System.out.println("Enter array size");
		size = sr.nextInt();
		System.out.println("The given number count in array: "+getCount(new int[size], searchingNumber));
		
	}

}

