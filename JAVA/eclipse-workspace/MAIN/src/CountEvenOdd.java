import java.util.Scanner;
public class CountEvenOdd {
	public static void main(String[] args) {
		String result = "";
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sr.nextInt();
		String s = String.valueOf(num);
		int len = s.length();
		char ch[] = s.toCharArray();
		int even = 0, odd = 0;
		boolean b = true;
		for (int i = 0; i < len; i++) {
			if (len >= 15) {
				b = false;
				break;
			} 
			else if (num < 0) {
				b = false;
				break;
			} 
			else {
				if(ch[i] == 48)
					odd++;
				else if (ch[i] % 2 != 0) {
					odd++;
				} 
				else if (ch[i] % 2 == 0) {
					even++;
				}
			}
		}
		if (b == true)
			result += odd + "\n" + even;
		else
			result = "Invalid input";
		System.out.println(result);
	}
}