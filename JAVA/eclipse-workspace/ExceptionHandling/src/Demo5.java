
public class Demo5 {

	public static void main(String[] args) {
		
			System.out.println("welcome");
			try {
				
				int a =Integer.parseInt(args[0]);
				int b =Integer.parseInt(args[1]);
				int c = a+b;
				System.out.println(c);
			}
			catch(Exception e) {
				System.out.println("Invalid argument "+e);
			}
			System.out.println("Hello");
	}

	

}
