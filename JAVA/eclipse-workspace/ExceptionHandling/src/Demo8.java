
public class Demo8 {

	public static void main(String[] args) {
		try {
			int a=args.length;
			int b=12/a;
		//	System.out.println("a: "+a);
			try {
				//int b=12/a;

				if(a==1) {
					a=a/(a-a);
				}
				if(a==2) {
					int c[]= {1};
					c[34]=22;
				}
			}
			catch (ArithmeticException e) {
				System.out.println("in ArithmeticException"+e);
			}
//			catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("in ArrayIndexOutOfBoundsException"+e);
//			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out ArithmeticException"+e);
		}

	}

}
