import java.util.HashMap;
import java.util.Map;

public class CumulativeSum {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 2, 34, 2, 1, 2, 2, 5, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int s = numbers[i];
			if (!map.containsKey(numbers[i])) {
				for (int j = i + 1; j < numbers.length; j++) {
					if(numbers[i]==numbers[j]) {
						s=s+numbers[j];
					}
				}
				map.put(numbers[i], s);
			}
		}
		System.out.println(map);
	}
}
