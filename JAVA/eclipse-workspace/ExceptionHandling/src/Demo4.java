
public class Demo4 {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			System.out.println(args[1]);
		}
		catch(Exception e) {
			System.out.println("Invalid argument "+e.getMessage());
		}
		System.out.println("Hello");
		try {
			Object obj=new Object();
			Demo4 d =(Demo4)obj;
		}
		catch(Exception e) {
			System.out.println("ClassCastException "+e.getMessage());
		}
		System.out.println("Hello......");
		
	}

}
