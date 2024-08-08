
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		System.out.println("Eneter elements into an array");
		Scanner sr = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sr.nextInt();
		}	
		//first remove duplicate elements
				for (int i = 0; i < a.length; i++) {
					for (int j = i+1; j < a.length; j++) {
						if(a[i]>a[j]) {
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
				
					System.out.println(a[1]);
					
		
	}
}
