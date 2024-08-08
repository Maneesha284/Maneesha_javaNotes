
public class Demo7 {

	public static void main(String[] args) {
		try {
			int a=0,b=12/a;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0");
		}
		catch (ArithmeticException e) {
			System.out.println("1");
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
