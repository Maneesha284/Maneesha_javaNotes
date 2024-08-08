
import java.util.Scanner;

public class OddCounter {
	static Scanner sr = new Scanner(System.in);
	static int size,oddCount = 0;
	public static int getOddCount(int[] a) {
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}
		if(a.length == 10) {
			for(int i = 0; i <a.length; i++) {	
					if(a[i]%2 == 1 ) {
						oddCount++;
					}
			}
		}
		else {
			return -1;
		}
		return oddCount;
	}
	public static void main(String[] args) {
		System.out.println("Enter array size");
		size = sr.nextInt();
		System.out.println("The given array odd count: "+getOddCount(new int[size]));
		
	}

}

