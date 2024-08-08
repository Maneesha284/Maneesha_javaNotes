import java.util.Scanner;
///11,13;17,19;
public class TwinPrimes {
	public static String getTwinPrimes(int num1,int num2) {
		String s1 = "";
		int arr[] = new int[20];
		int val = 0;
		for(int i = num1; i <= num2; i++) {
			int flag = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				arr[val] = i;
				val++;
			}
		}
		for(int i = 0;i < val; i++) {
			//System.out.println(a[i]);
			if(arr[i + 1] - arr[i]  == 2) {
				s1=s1+"(" +arr[i] +"," +arr[i+1] +");";
			}
		}
		return s1;
		//return null; 
	}	
		
	public static void main(String s[]) {
		try {
			Scanner sr = new Scanner(System.in);
			System.out.println("Enter input value");
			int num1 = sr.nextInt();
			int num2 = sr.nextInt();
			if(num1 < 1 || num2 > 100) {
				System.out.println("Error");
			}
			else {
				System.out.println(getTwinPrimes(num1, num2));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
