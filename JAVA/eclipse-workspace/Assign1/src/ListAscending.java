import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ListAscending {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(6);
		l.add(7);
		l.add(7);
		
		 l.stream().sorted().collect(Collectors.toList());
		List<Integer> list = l.stream().sorted().toList();
		System.out.println(list);
		
	 long count = l.stream().count();
	System.out.println(count);}
}
