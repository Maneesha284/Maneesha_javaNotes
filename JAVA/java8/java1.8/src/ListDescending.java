import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
		
		//l.stream().sorted().forEach(System.out::println);
		List<Integer> list = l.stream().sorted().collect(Collectors.toList());
		System.out.println(list);

	}
}
