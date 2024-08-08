class A{
	
}
final class B extends A{
	
}
final class C{
	
}
final class D extends A{
	
}
public class FinallyExample {

	public static void main(String[] args) {

		try {
			int a=0,b=12/a;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0");
		}
		catch (ArithmeticException e) {
			System.out.println("1");
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("2");
		}
		catch (Throwable e) {
			System.out.println("3");
		}
		finally {
			System.out.println("4");
			System.exit(0);
		}
		
	}

}
