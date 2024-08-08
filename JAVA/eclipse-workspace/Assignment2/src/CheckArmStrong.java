
public class CheckArmStrong {
	public static void main(String s[]) {
		try {
			int no = Integer.parseInt(s[0]);
			int countDigits = 0;
			int temp = no;
			while(temp > 0) {
				temp = temp / 10;
				countDigits++;
			}
			if(countDigits != 4 || no < 0) {
				System.out.println("Error");
			}
			else {
				int val = no,sum = 0;
				while(val > 0) {
					int rem = val % 10;
					sum = sum + (rem * rem * rem * rem);
					val = val / 10;
				}
				if(no == sum) {
					System.out.println("Armstrong Number");
				}
				else {
					System.out.println("Not Armstrong Number");
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}	
	}
}
