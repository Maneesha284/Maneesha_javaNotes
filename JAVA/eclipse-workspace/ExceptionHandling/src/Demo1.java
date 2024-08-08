
public class Demo1 {

	public static void main(String[] args) {
		System.out.println("welcome1");
		System.out.println("welcome2");
		try {
			System.out.println(10/0);
			System.out.println("welcome3");
		}
		catch(Throwable e) {
			System.out.println("Don't enter denominotor as zero " + e);
		}
		
		System.out.println("welcome4");
		System.out.println("welcome5");
		
		
	}

}
