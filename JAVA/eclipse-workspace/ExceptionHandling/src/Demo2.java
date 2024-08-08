
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {

			int a = args.length;
			System.out.println("a: " + a);
			int b = 10 / a;
			int c[] = { 1 };
			c[50] = 99;
			System.out.println(c);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Invalid argument " + e1);
		} catch (ArithmeticException e2) {
			System.out.println("Invalid argument " + e2);
		} catch (Exception e) {
			System.out.println("Invalid argument " + e);
		}
		finally {
			System.out.println("Always it exceutes");
		}
		System.out.println("Hello");
	}
}
