
public class Adder {
	public static int getSum(int no1, int no2) {
		int sum = 0;
		sum = no1 + no2;
		return sum;
	}
	public static void main(String s[]) {
		try {
			if(Integer.parseInt(s[0]) < 0 || Integer.parseInt(s[1]) < 0) {
				System.out.println("Error");
			}
			else {
				System.out.println(getSum(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
