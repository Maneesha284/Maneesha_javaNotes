
public class NoOfArgs3 {
	public static void display(int a,String ...names) {
		System.out.println(a);
		System.out.println("names");
		for (String s : names) {
			System.out.println(s);
		}
		
	}

	
	public static void main(String ...args) {
		display(100,args);
		
	}
	
}
