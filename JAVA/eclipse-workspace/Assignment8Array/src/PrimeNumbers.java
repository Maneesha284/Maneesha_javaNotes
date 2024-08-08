import java.util.Scanner;

public class PrimeNumbers {
	
	static int size = 0;
	static int[] primeNum(int[] prime) {
		
		int result[] = new int[prime.length];
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < prime.length; i++) {
			prime[i] = sr.nextInt();
		}
		
		for(int i = 0; i < prime.length; i++) {
			
			int flag = 0;
			int j = 2;
			while(j < prime[i]) {
				
				if(prime[i] % j == 0) {
					flag++;
				}
				j++;
	
			}
			
			if(flag == 0) {
				result[size]  = prime[i];
				size++;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		int prime[] = new int[10];
		
		prime = primeNum(new int[prime.length]);
		
		System.out.println("The prime element in array: ");
		for(int i = 0; i < size; i++) {
			System.out.println(prime[i]);
		}
	}
}
