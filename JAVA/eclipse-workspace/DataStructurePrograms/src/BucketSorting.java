import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BucketSorting {

	private static void bucketSort(int[] arr, int bucketSize) {
		List<Integer>[] buckets = new List[bucketSize];

		for (int i = 0; i < bucketSize; i++) {
			buckets[i] = new LinkedList<>();
		}
		for (int num : arr) {
			buckets[num / bucketSize].add(num);
		}
		for (List<Integer> bucket : buckets) {
			Collections.sort(bucket);
		}

		int index = 0;
		for (List<Integer> bucket : buckets) {
			for (int num : bucket) {
				arr[index++] = num;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = { 37, 74, 12, 45, 67, 99, 65, 29, 32, 9, 15, 4 };
		System.out.println("Original array- " + Arrays.toString(arr));
		System.out.println("Enter size of the bucket : ");
		bucketSort(arr, scanner.nextInt());
		System.out.println("Sorted array after bucket sort- " + Arrays.toString(arr));
	}

}