
public class Demo6 {

	public static void main(String[] args) {
		String s1="java 2021";
		String a[]=s1.split(" ");
		try {
			int x = Integer.parseInt(a[1]);
			System.out.println(x);
			
		}
		catch (Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}
		
		/*String s1="java 2021";
		String a[]=s1.split(" ");
		try {
			int x = Integer.parseInt(a[0]);
			System.out.println(x);
			
		}
		catch (Exception e) {
			System.out.println("catch");
		}
		finally {
			System.out.println("finally");
		}*/
	}

}
