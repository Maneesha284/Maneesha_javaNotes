
public class EvenNumberTester{
	public static boolean isEven(int no){
		if(no % 2 == 0)
			return true;
		else
		  return false;
	}
	public static void main(String s[]) {
		int no1 = Integer.parseInt(s[0]);
		int no2 = Integer.parseInt(s[1]);
		try {
			if(no1 < 0 || no2 < 0) {
				System.out.println("Error");
			}
			else {				
				for(int i = no1, j = no2; i <= j; i++) {
					if(isEven(i)) {
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
