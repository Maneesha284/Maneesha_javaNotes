import java.util.Scanner;

public class NameScore {

	static int getNameScore(String string) {
		int sum = 0;

		String str = string.toLowerCase();
		if (string.length() == 0 || string.equals(null)) {
			sum = -2;
		}
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);

			if (val < 97 || val > 122) {
				sum = -1;
				break;
			} else {

				sum += val - 96;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		System.out.println(getNameScore(scanner.nextLine()));

	}

}
