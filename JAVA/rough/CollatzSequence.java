import java.util.InputMismatchException;
import java.util.Scanner;

public class CollatzSequence {
	public static void getSequence(int no) {
		System.out.print(no+" ");
		int tries=1;
		while(no!=1) {
			
			if(no%2==0)
				no=no/2;
			else if(no%2==1) 
				no=(no*3)+1;
			tries++;
			if(tries<100) {
				System.out.print(no+" ");
			}
			else {
				System.out.println("Does not Converge");
				System.exit(0);
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter input value");
		try {
			int num=sr.nextInt();
			if(num<0) {
				System.out.println("Error");
				System.exit(0);
			}
			else {
				getSequence(num);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Error");
		}
	}

}
