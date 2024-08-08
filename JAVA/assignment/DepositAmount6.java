import java.util.Scanner;

public class DepositAmount6 {
	public static double deposit(double depositAmount,float interest,int year) {
		double total=(depositAmount*interest*year)/100;
		return total;
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter Deposit amount");
		double depositAmount=sr.nextDouble();
		System.out.println("Enter rate of an interest");
		float interest=sr.nextFloat();
		System.out.println("Enter time duration in years");
		int year=sr.nextInt();
		System.out.println("Total interest of a deposit amount: "+deposit(depositAmount,interest,year));	
	}
}
