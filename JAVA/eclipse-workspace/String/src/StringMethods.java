import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any string:");
		String name=sc.next();
		String result="";
		for(int i=name.length()-1;i>=0;i--) {
			result+=name.charAt(i);
		}
	}

}
