import java.util.Scanner;

public class Factors {
	static String getFact(int num) {
		String result = "";
		int i = 1;
		while(i < num) {
			if(num % i == 0) {
				result += i + " ";
			}
			i++;
		}
		return result ;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(getFact(sr.nextInt()));
	}

}
