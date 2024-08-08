package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("size= " + list.size());
		list.add(22);
		list.add(45.6f);
		list.add("maneesha");
		list.add('f');
		list.add(false);
		list.add(null);
		list.add(0,"anu");
		System.out.println("After adding values the size= " + list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
