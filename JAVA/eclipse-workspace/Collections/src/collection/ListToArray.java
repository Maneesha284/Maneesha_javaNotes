package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArray {
	static int[] coverToArray(List<Integer> list, int[] arr) {
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		
		return arr;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sr.nextInt();
		List<Integer> list =new ArrayList<Integer>(size);
				System.out.println("Enter integer values into a list"); 
		for(int i=0;i<size;i++) {
			list.add(sr.nextInt()); 
		}
		int arr[]=new int[size];
		arr=coverToArray(list, arr);
		System.out.println("After adding list elements into an array");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}

	}

}
