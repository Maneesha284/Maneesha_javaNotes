

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class FirstRepeatedChar {
	public static void main(String[] args) {
	    Character character = "appleapplqw".chars()     
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();
	    System.out.println("First  non  repeated  character  is  :    " + character);
	   
	  }
	 
}

