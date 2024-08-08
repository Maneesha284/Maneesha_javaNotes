
public class ListFactors {

	public static void main(String s[]) {
		try {
			int no = Integer.parseInt(s[0]);
			if(no < 0) {
				System.out.println("Error");
			}
			else {
				for(int i = 1;i <= no; i++) {
					if(no % i == 0) {
						System.out.println(i);
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
