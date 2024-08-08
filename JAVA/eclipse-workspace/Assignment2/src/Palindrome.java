
public class Palindrome {
	public String isPalindrome(int no){
		int temp = no, sum = 0;
		while(temp > 0) {
			int rem = temp % 10;
			sum = (sum * 10) + rem; 
			temp = temp / 10;
		}
		if(sum == no) {
			return "true";
		}
		else
			return "false";	
	}
	public static void main(String s[]) {
		Palindrome p1 = new Palindrome();
		try {
			if(Integer.parseInt(s[0]) < 0) {
				System.out.println("Error");
			}
			else {				
				System.out.println(p1.isPalindrome(Integer.parseInt(s[0])));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
