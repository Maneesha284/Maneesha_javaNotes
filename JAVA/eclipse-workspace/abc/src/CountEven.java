
public class CountEven {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 8, 9, 10, 15, 20 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
