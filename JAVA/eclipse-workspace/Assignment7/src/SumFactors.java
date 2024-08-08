import java.util.Scanner;

public class SumFactors {
	static int getFact(int num) {
		int result = 0;
		int i = 1;
		while(i < num) {
			if(num % i == 0) {
				result += i ;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(getFact(sr.nextInt()));
	}
}
