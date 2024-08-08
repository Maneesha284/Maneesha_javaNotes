package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBoxing {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("size= " + list.size());
		Integer num = new Integer(10);
		Float f = new Float(18.2);
		String s = "hello";
		Character ch = new Character('s');
		Boolean b = new Boolean(true);
		list.add(num);
		list.add(f);
		list.add(s);
		list.add(ch);
		list.add(b);
		System.out.println("After adding values the size= " + list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
