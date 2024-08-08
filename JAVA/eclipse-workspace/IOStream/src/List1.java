import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ghfh");
		list.add("fghs");
		list.add("etty");
		list.add("fghj");
		list.add("mngh");
		/*
		 for(int i=0;i<list.size();i++){
		 	System.out.println(i);
		 }
		 
		 */
		list.forEach(p -> System.out.println(p));
		
	}

}
