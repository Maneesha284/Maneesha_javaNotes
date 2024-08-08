import java.util.Scanner;

public class OddPalindrome {
	static Scanner sr = new Scanner(System.in);
	public static String getOddPalindromeList(int startNum, int endNum) {
		String str = "";
		if(startNum > endNum || startNum < 100 || endNum > 999 ) {
			System.out.println("Error");
		}
		else {
			for(int i = startNum; i < endNum; i++) {
				int temp = i, rev = 0;
				while(temp > 0) {
					int rem = temp % 10;
					rev = (rev * 10) + rem; 
					temp = temp / 10;
				}
				if(rev == i) {
					if(i % 2 == 1) {
						str = str + rev + " ";
					}
				}
			}
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println("Enter startNum, and endNum");
		int startNum = sr.nextInt();
		int endNum = sr.nextInt();
		System.out.print(getOddPalindromeList(startNum, endNum));
	}

}
