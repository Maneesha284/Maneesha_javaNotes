package collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("maneesha");
		list.add(22);
		list.add(45);
		String s1=(String)list.get(0);
		String s2=(String)list.get(2);
		System.out.println(s1+"   "+s2);
		/*To overcome above problem use generics 
		 1.To provide type safety 
		 2.To overcome type casting problems in java introduced generics   */
	}

}
