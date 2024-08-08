import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class ArrayListMap {

	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6,1,1,2,2, 6, 6, 7, 8));
		Map<Integer, Long> elementCountMap = 
				numbersList.stream()
				.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		System.out.println(elementCountMap);
		

	}
}
