import java.util.ArrayList;
import java.util.List;


public class ListTotalEle {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		l.add(6);
		l.add(7);
		long count = l.stream().count();
		System.out.println(count);
	

	}

}
