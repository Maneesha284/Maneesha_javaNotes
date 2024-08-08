import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the first array in the format [a,b,c]:");
//        String input1 = scanner.nextLine();
//        System.out.println("Enter the second array in the format [a,b,c]:");
//        String input2 = scanner.nextLine();
//        int[] array1 = parseStringToArray(input1);
//        int[] array2 = parseStringToArray(input2);
		
		String[] input = { "[5,7,3]", "[1,2,9]" };
		int[] array1 = parseStringToArray(input[0]);
		int[] array2 = parseStringToArray(input[1]);
		int[] result = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] + array2[i];
		}

		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	private static int[] parseStringToArray(String s) {
		s = s.substring(1, s.length() - 1);
		String[] stringArray = s.split(",");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}
		return intArray;
	}
}
