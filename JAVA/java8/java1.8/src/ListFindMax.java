import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListFindMax {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(54);
		l.add(51);
		l.add(12);
		l.add(65);
		l.add(13);
		l.add(61);
		l.add(17);
	
		Integer integer = l.stream().max(Integer::compare).get();
		System.out.println(integer);
		
		
		  Optional<Integer> max = l.stream().max(Integer::compare);
		  System.out.println(max);
		 
	}

}
