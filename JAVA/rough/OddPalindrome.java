import java.util.Scanner;

public class OddPalindrome {
	public static void getOddPalindromeList(int startNum, int endNum) {
		if(startNum>endNum || startNum<100 || endNum>999 ) {
			System.out.println("Error");
		}
		else {
			System.out.println("========");
			for(int i=startNum;i<endNum;i++) {
				int temp=i,rev=0;
				while(temp>0) {
					int rem=temp%10;
					rev=(rev*10)+rem; 
					temp=temp/10;
				}
				if(rev==i) {
					if(i%2==1) {
						System.out.print(rev+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter startNum, and endNum");
		int startNum = sr.nextInt();
		int endNum = sr.nextInt();
		getOddPalindromeList(startNum,endNum);
	}

}
