import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		String str="manimanifguyf";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(Character ch : str.toCharArray()) {
			m.put(ch, m.containsKey(ch)?m.get(ch)+1:1);
		}
		System.out.println(m);
		
	}

}
