
import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;
import java.util.stream.Collectors;
public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str ="bbjjmanisha";
		System.out.println(NonRepeatedChar(str));
//	    Character character = "appleapplqw".chars()      //string stream
//	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
//	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
//	             .entrySet().stream()
//	             .filter(entry -> entry.getValue() == 1L)
//	             .map(entry -> entry.getKey())
//	             .findFirst().get();
//	    System.out.println("First  non  repeated  character  is  :    " + character);
//	   
//	  }
//	 
}

	private static Character NonRepeatedChar(String str) {
		// TODO Auto-generated method stub
		Map<Character,Integer> m = new HashMap();
		for(Character ch : str.toCharArray()) {
			m.put(ch,m.containsKey(ch) ? m.get(ch)+1:1);  
		}
		Character ch =  m.entrySet().stream().filter(x -> x.getValue()== 1).findFirst().get().getKey();
	
		return ch;
	}
}
