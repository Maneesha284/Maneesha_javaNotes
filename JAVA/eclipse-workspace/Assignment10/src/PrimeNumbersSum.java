import java.util.Scanner;

public class PrimeNumbersSum {
	static int getPrimeNumbersSum(int firstNum, int secondNum) {
		int sum = 0;
		if (firstNum < 0 || secondNum < 0) {
			sum = -1;
		} 
		if (firstNum == 0 || secondNum == 0) {
			sum = -2;
		} 
		else if ((firstNum >secondNum) || (firstNum == secondNum)) {
			sum = -3;
		} 
		
		else {
			int size = 0;
			int[] a = new int[50];
			for(int i=firstNum; i< secondNum;i++) {
				if(isPrime(i)) {
					a[size] = i; 
					size++;
				}
			}
			for(int i = 0; i < size ; i++) {
				sum += a[i] ;
			}
		}
		return sum;

	}
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

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int firstNum = sr.nextInt();
		int secondNum = sr.nextInt();
		System.out.println(getPrimeNumbersSum(firstNum, secondNum));

	}

}
