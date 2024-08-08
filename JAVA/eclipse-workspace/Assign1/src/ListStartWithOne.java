import java.util.ArrayList;
import java.util.List;

public class ListStartWithOne {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(54);
		l.add(51);
		l.add(12);
		l.add(65);
		l.add(13);
		l.add(61);
		l.add(17);
		l.add(142);
		List<Integer> list = l.stream().filter(i -> i.toString().startsWith("5")).toList();
		System.out.println(list);

	}

}
