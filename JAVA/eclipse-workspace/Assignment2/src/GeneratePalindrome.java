
public class GeneratePalindrome {
	public static void getPalindromeList(int no) {
		System.out.println(no);
		int add = no;
		while(true) {
			int temp = add, rev = 0;
			while(temp > 0) {
				int rem = temp % 10;
				rev=(rev * 10)+rem; 
				temp=temp / 10;
			}
			if(rev == add) {
				System.out.println(rev);
			}
			else {
				System.out.println(rev);
				System.out.println(add);
				add = rev+add;
			}
		}
		
	}
	public static void main(String s[]) {
		try {
			if(Integer.parseInt(s[0]) <= 100 || Integer.parseInt(s[0]) >= 999) {
				System.out.println("Error");
			}
			else {
				getPalindromeList(Integer.parseInt(s[0]));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
