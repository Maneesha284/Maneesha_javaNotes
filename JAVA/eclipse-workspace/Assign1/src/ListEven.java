import java.util.ArrayList;
import java.util.List;


public class ListEven {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(6);
		l.add(7);
		List<Integer> list = l.stream().filter(i->i%2==0).toList();
		System.out.println(list);
	

	}

}
