
public class StringComp {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		if (str1 == str2) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		if (str1.equals(str2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		System.out.println("--------------");
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		if (str3 == str4) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
		if (str3.equals(str4)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not same");
		}
	}
}
