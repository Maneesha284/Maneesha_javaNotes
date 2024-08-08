import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements you want to enter?");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("enter the elements");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr, 0, arr.length - 1);

		for (int x : arr) {
			System.out.println(x);
		}
	}

	private static void sort(int[] arr, int i, int j) {
		if (i < j) {
			int mid = (i + j) / 2;

			sort(arr, i, mid);

			sort(arr, mid + 1, j);

			merge(arr, i, mid, j);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int b[] = new int[arr.length];
		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				b[k] = arr[i];
				i++;
				k++;
			} else {
				b[k] = arr[j];
				j++;
				k++;
			}
		}

		while (i <= mid) {
			b[k] = arr[i];
			i++;
			k++;
		}

		while (j <= high) {
			b[k] = arr[j];
			j++;
			k++;
		}

		for (i = low; i <= high; i++) {
			arr[i] = b[i];
		}
	}

}
