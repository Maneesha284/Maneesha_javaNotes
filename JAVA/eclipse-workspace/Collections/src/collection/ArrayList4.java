package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(22);
		list.add(45);
		list.add(32);
		list.add(85);
		list.add(12);
		list.add(95);
		Collections.sort(list);
		for(Integer i: list) {
			System.out.println(i);
		}
	}
}