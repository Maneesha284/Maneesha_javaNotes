import java.util.Scanner;

public class FillMultiples {
	static Scanner sr = new Scanner(System.in);
	static int a[] = new int[10];
	public static int[] getMultiplesArray(int number) {
		if(number <= 0 ) {
			return null;
		}
		else {
			for(int i = 0, j = 1 ; i < a.length; i++) {
				a[i] = j * number;
				j++;
			}
		}
		return a;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		int number = sr.nextInt();
		a = getMultiplesArray(number);
		if(a == null)
			System.out.println("null");
		else {
			System.out.println("Multiple of given number...");
			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	}

}
