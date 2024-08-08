package collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class PrimeNumbers1 {

	public static Vector<Integer> rangePrimeNumbers(int startNum, int endNum) {
		Vector<Integer> result =new Vector<Integer>();
		System.out.println("Enter elements in array");
		for (int num = startNum; num < endNum; num++) {
			int flag = 0;
			int i = 2;
			while (i<num/2) {
				if (num % i == 0) {
					flag++;
					break;
				}
				i++;

			}

			if (flag == 0) {
				result.addElement(num);
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
		Vector<Integer> v = rangePrimeNumbers(startNum, endNum);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

		

	}

}
