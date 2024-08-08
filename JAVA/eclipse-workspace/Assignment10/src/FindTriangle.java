import java.util.Scanner;

public class FindTriangle {
	static String findTriangle(int len1, int len2, int len3) {
		String result = "";
		if (len1 == 0 || len2 == 0 || len3 == 0) {
			result += -1;
			return result;
		} 
		else if (len1 < 0 || len2 < 0 || len3 < 0) {
			result += -2;
			return result;
		} 
		else if ((len1 + len2) < len3) {
			result += -3;
			return result;
		} 
		else {
			if (len1 == len2 && len2 == len3 && len3 == len1) {
				result += "scalene";
				return result;
			} 
			else if (len1 == len2 || len2 == len3 || len3 == len1) {
				result += "equilateral";
				return result;
			} 
			else if (len1 != len2 && len2 != len3 && len3 != len1) {
				result += "isoscele";
				return result;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter three length");
		int len1 = sr.nextInt();
		int len2 = sr.nextInt();
		int len3 = sr.nextInt();
		System.out.println("Type of triangle is: " + findTriangle(len1, len2, len3));

	}

}
