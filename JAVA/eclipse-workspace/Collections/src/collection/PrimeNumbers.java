package collection;

import java.util.Scanner;
import java.util.Vector;

public class PrimeNumbers {

	public static Vector<Integer> rangePrimeNumbers(int startNum, int endNum) {
		int size=0;
		Vector<Integer> result =new Vector<Integer>(size);
		System.out.println("Enter elements in array");
		for (int i = startNum; i < endNum; i++) {
			int flag = 0;
			int j = 2;
			while (j < i) {
				if (i % j == 0) {
					flag++;
				}
				j++;

			}

			if (flag == 0) {
				result.add(i);
				size++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter startNum ");
		int startNum = sr.nextInt();
		System.out.println("Enter endNum");
		int endNum = sr.nextInt();
		Vector<Integer> v = new Vector<Integer>();

		v = rangePrimeNumbers(startNum, endNum);

		System.out.println(v);

	}

}
