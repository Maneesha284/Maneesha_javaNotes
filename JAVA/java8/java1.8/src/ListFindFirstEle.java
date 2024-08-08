import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ListFindFirstEle {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
	
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(6);
		l.add(7);
		System.out.println(l.stream().findFirst().get());
	//	System.out.println(findFirst);
		
//		Optional<Integer> findAny = l.stream().findAny();
//		System.out.println(findAny);

	}

}
