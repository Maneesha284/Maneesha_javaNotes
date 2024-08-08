import java.util.Scanner;

public class TwinPrimeNumbers {
	static boolean isPrime(int num) {
		boolean b = false;
		int i = 2;
		int flag = 0;
		while(i < num) {
			if(num % i == 0) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0){
			b = true;
		}	
		return b;
	}
	static String getTwinPrime(int startValue, int endValue) {
		String result = "";
		int size = 0;
		int[] a = new int[50];
		for(int i=startValue; i< endValue;i++) {
			if(isPrime(i)) {
				a[size] = i; 
				size++;
			}
		}
		for(int i = 0; i < size ; i++) {
			if(a[i+1] - a[i] == 2) {
				result += a[i] + " " +a[i + 1] + "\n";
			}
		}
		return result;
	}
	public static void main(String[] args) {	
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		System.out.println(getTwinPrime(sr.nextInt(), sr.nextInt()));
	}

}
