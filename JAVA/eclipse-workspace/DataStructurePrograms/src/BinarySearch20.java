import java.util.Scanner;

public class BinarySearch20 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sr.nextInt();
		System.out.println("Enter Array elements");
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sr.nextInt();
		}
		System.out.println("Enter searching element");
		int se = sr.nextInt();
		for (int i = 0; i < size; i++) {
			int temp;
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("---------");
		int low = 0, high = size - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == se) {
				System.out.println(se + " is found at " + mid);
				break;
			} else if (a[mid] < se) {
				low = mid + 1;
			} else if (a[mid] > se) {
				high = mid - 1;
			}
		}
	}
}