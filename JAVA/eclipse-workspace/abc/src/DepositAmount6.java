//import java.util.Scanner;
//
//public class DepositAmount6 {
//	public static double deposit(double depositAmount,float interest,int year) {
//		double total=(depositAmount*interest*year)/100;
//		return total;
//	}
//	public static void main(String[] args) {
//		Scanner sr=new Scanner(System.in);
//		System.out.println("Enter Deposit amount");
//		double depositAmount=sr.nextDouble();
//		System.out.println("Enter rate of an interest");
//		float interest=sr.nextFloat();
//		System.out.println("Enter time duration in years");
//		int year=sr.nextInt();
//		System.out.println("Total interest of a deposit amount: "+deposit(depositAmount,interest,year));	
//	}
//}


import java.util.Scanner;

public class DepositAmount6 {
    public static void main(String[] args) {
        System.out.println("Enter elements into an array && don't enter zeros (0)");
        Scanner sr = new Scanner(System.in);
        int a[] = new int[10];
        int a1[] = new int[10];
        int len = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sr.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[i] != 0) {
                    boolean alreadyInA1 = false;
                    for (int k = 0; k < len; k++) {
                        if (a1[k] == a[i]) {
                            alreadyInA1 = true;
                            break;
                        }
                    }
                    if (!alreadyInA1) {
                        a1[len] = a[i];
                        len++;
                    }
                    a[j] = 0;
                }
            }
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < len; i++) {
            System.out.println(a1[i]);
        }
    }
}
