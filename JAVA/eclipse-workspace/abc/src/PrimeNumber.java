import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sr.nextInt();
		for(int i=2;i<100;i++) {
			if(num%i==0) {
				System.out.println("not prime number");
				break;
			}else {
				System.out.println("prime number");
				break;
			}
		}

	}

}
