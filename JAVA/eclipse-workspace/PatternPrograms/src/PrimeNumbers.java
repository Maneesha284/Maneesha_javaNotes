import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {	
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter range:");
		int range = sr.nextInt();
		for(int i = 1; i <= range; i++) {
			int flag = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag++;
					break;
				}
				else {
					flag = 0;
				}
			}
			if(flag == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
