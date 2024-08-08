import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicatess {

	public static void main(String[] args) {
		int arr[]= {2,3,4};
		List<Integer> duplicates=findDuplicate(arr);

	}
	public static List<Integer> findDuplicate(int arr[]){
		
		return ((Stream<Integer>) Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()))).toList();		
	}

}
