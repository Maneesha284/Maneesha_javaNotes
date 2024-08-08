package functionalinterface;
@FunctionalInterface
interface Interfa{
	public void add(int a,int b);
}
public class FunctionalInterface2 {

	public static void main(String[] args) {
		
		Interfa i=(m,n)->{
			System.out.println("add: "+(m+n));
		};
		i.add(4, 5);
	}

}
