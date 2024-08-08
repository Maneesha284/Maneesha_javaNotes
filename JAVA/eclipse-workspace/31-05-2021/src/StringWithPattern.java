
public class StringWithPattern {
	static int size = 0;

	public static String[] getWordsContainsPattern(String[] words, String pattern) {

		String result[] = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			boolean b = false;
			for (int j = 0; j < words[i].length(); j++) {

				if (words[i].contains(pattern)) {
					result[size] = words[i];
					size++;
					break;
				}

			}

		}
		return result;
	}

	public static void main(String[] args) {
		String[] words = { "South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India",
				"Australia", "Pakistan", "Bangladesh" };
		String pattern = "an";
		String arr[] = getWordsContainsPattern(words, pattern);
		for (int i = 0; i < size; i++) {

			System.out.println(arr[i]);
		}
	}
}
