//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67
public class Prime {
	public static boolean isPrime(int no){
		int rem = 0;
		for(int i = 2;i < no; i++) {
			rem = no % i;
			if(rem == 0) {
				return false;
			}
		}
		return true;	
	}
	public static void main(String s[]) {
		try {
			if(Integer.parseInt(s[0]) < 0) {
				System.out.println("Error");
			}
			else {				
				System.out.println(isPrime(Integer.parseInt(s[0])));
			}
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
