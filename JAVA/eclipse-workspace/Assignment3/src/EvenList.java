import java.util.Scanner;

public class EvenList {
	static Scanner sr = new Scanner(System.in);
	static int size, j = 0;
	public static int[] getEvenArray(int[] a){
		int b[] = new int[size];
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}
		if(a.length == 10) {
			for(int i = 0; i < a.length; i++) {
				if(a[i] % 2 == 0) {
					b[j] = a[i];
					j++;
				}
			}
		}
		else {
			return null;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Enter array size");
		size = sr.nextInt();
		int a[] = new int[size];
		a = getEvenArray(new int[size]);
		if(a == null)
			System.out.println("null");
		else {
			System.out.println("Get Even elements are...");
			for(int i = 0; i < j; i++) {
				System.out.println(a[i]);
			}
		}
		
	}

}
