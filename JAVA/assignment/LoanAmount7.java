
public class LoanAmount7 {
	public static double calculateLoan(double depositAmount,float interest,int months) {
		int year=months/2;
		double total=(depositAmount*interest*year)/100;
		return total;
	}
	public static void main(String[] args) {
		double amount=100000;
		float interest=7.0f;
		int months=24;
		System.out.println("Total interest of a deposit amount: "+calculateLoan(amount,interest,months));	
	}
}
