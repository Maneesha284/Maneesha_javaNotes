import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size ");
		int size = sr.nextInt();
		int a[] = new int[size];
		System.out.println("Enter values: ");
		for(int i = 0; i < size ; i++) {
			a[i] = sr.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = i; j < size; j++) {
				if(a[i] >= a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < size ; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
