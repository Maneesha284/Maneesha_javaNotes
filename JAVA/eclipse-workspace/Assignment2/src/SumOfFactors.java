
public class SumOfFactors {

	public static void main(String s[]) {
		try {
			int no = Integer.parseInt(s[0]);
			if(no < 0) {
				System.out.println("Error");
			}
			else {
				int sum = 0;
				for(int i = 1;i <= no; i++) {
					if(no % i == 0) {
						sum = sum + i;
					}
				}
				System.out.println(sum);
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
