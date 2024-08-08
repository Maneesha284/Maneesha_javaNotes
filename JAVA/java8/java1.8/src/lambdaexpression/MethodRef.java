package lambdaexpression;

interface Interf2{
	public void hello();
}
public class MethodRef  {
	public static void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		Interf2 m=MethodRef::display;
		
		m.hello();
		
	}
	

}
