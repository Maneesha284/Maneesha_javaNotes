import java.util.Scanner;

public class IncrDecr {

	static int[] getIncreaseDecrease(int number) {
		int[] arr1 = new int[number];
		if (number > 1 && number < 20) {
			int num = 1;
			for (int i = 0; i < arr1.length; i++) {
				if (i % 2 == 0) {
					arr1[i] = num;
					num++;

				} 
				else {

					arr1[i] = number;
					number--;
				}
			}

		} 
		else {

			return null;
		}
		return arr1;

	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a number");
		int[] increaseDecrease = getIncreaseDecrease(sr.nextInt());
		for (int arr : increaseDecrease) {
			System.out.println(arr);
		}
	}

}