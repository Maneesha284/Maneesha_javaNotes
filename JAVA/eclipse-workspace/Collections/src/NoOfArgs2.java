
public class NoOfArgs2 {
	public static void display(int a,String ...names) {
		System.out.println(a);
		System.out.println("names");
		int big=a;
		for (String s : names) {
			System.out.println(s);
		}
		
	}

	
	public static void main(String[] args) {
		display(1,"mani","anu","renu");
		
	}
	
}
