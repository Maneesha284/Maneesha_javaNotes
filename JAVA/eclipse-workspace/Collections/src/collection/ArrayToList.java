package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	static List<String> convertToList(String[] arr, List<String> list) {
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sr.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter String values into an array");
		for (int i = 0; i < size; i++) {
			arr[i] = sr.next();
		}
		List<String> list = new ArrayList<String>(size);

		list = convertToList(arr, list);
		System.out.println("After adding array elements into a list");

		System.out.println(list);

	}

}
