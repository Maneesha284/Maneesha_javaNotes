import java.util.Scanner;

public class PositiveString {
	static boolean isValidString(String str) {
		boolean result=false;
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=1;i<str.length();i++) {
			int temp1 = (int)ch[i-1];
			int temp2 = (int)ch[i];
			temp2 = temp2-1;
			if(temp1 == temp2) {
				count++;
			}
			else {
				count=1;
				break;	
			}
		}
		if(count==1)
			result=false;
		else
			result=true;
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String str = sr.next();
		boolean b = isValidString(str);
		System.out.println(b);
		
			
		
	}

}
