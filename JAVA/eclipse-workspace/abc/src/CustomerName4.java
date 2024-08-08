import java.util.Scanner;

public class CustomerName4 {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter two customers name");
		String customer1=sr.nextLine();
		String customer2=sr.nextLine();
		String[] firstNameCustomer1=customer1.split(" ");
		String[] firstNameCustomer2=customer2.split(" ");
		boolean b=false;
		for(String s1:firstNameCustomer1) {
			for(String s2:firstNameCustomer2) {
				if(s1.equalsIgnoreCase(s2)) {
					b=true;
				}
				break;
			}
			break;
		}
		if(b)
			System.out.println("Firstname of two Customers is same");
		else
			System.out.println("Firstname of two Customers is not same");
		

	}

}
