import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListDescending {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(6);
		l.add(7);
		//List<Integer> list = l.stream().sorted(Comparator.reverseOrder()).toList();
		List<Integer> list2 = l.stream().sorted((s1,s2)->-s1.compareTo(s2)).toList();
		

		
		System.out.println(list2);
	

	}
}
