
import java.util.Scanner;
public class ReverseArr6 {
	public static void main(String[] args) {
		System.out.println("Eneter elements into first array");
		Scanner sr = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}	
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			b[i]=a[j];
			
		}
		System.out.println("Second array elements are...");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}
		sr.close();
	}
}
