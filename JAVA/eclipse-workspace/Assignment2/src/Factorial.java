
public class Factorial {

	public static void main(String s[]) {
		try {
			int no = Integer.parseInt(s[0]);
			if(no < 0) {
				System.out.println("Error");
			}
			else {
				int fact = 1;
				for(int i=1; i <= no; i++) {
					fact = fact * i;
				}
				System.out.println(fact);
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
