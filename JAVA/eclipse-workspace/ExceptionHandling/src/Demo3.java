
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			Integer i =new Integer("anc");
		}
		catch(NumberFormatException e) {
			System.out.println("Don't convert String to integer");
		}
		System.out.println("================");
		try {
			String str= null;
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println("NullPointerException "+e.getMessage());
		}
	}

}
