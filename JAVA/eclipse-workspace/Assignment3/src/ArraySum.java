
import java.util.Scanner;

public class ArraySum {
	static Scanner sr = new Scanner(System.in);
	static int size, sum = 0;
	public static int getOddCount(int[] a) {
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}
		for(int i = 0; i < a.length; i++) {	
				sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter array size");
		size = sr.nextInt();
		System.out.println("The given array sum: "+getOddCount(new int[size]));
		
	}

}

