import java.util.Scanner;

public class RussianMultiplication {
	static Scanner sr = new Scanner(System.in);
	public static int getProduct(int num1, int num2) {
		int sum = 0;
		int i=num1,j=num2;
		sum=sum+num2;
		while(i != 1) {
			i = i / 2;
			j = j * 2;
			if(i % 2 == 1) { 
				sum = sum + j; 
					
			}	
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter Num1, and Num2  values");
		int num1 = sr.nextInt();
		int num2 = sr.nextInt();
		System.out.println(getProduct(num1, num2));

	}

}
