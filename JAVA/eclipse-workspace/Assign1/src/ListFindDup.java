import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;


public class ListFindDup {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(54);
		l.add(51);
		l.add(12);
		l.add(65);
		l.add(13);
		l.add(65);
		l.add(17);
		l.add(13);
		l.add(54);
		l.add(13);
		l.add(10);
		l.add(65);
		List<Integer> list = l.stream().filter(i->Collections.frequency(l, i)>1).collect(Collectors.toSet()).stream().toList();
		//List<Integer> list = l.stream().filter(i->Collections.frequency(l, i)>2).toList();
		
		System.out.println(list);

	}

}
