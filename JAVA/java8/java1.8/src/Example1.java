

interface Interface1{
	public static void sub(int a,int b) {
		
		System.out.println("The subtraction of 2 numbers "+(a-b));
	}
	public void add(int a,int b);
	default void mul(int a, int b) {
		System.out.println("The multplication of 2 numbers "+(a*b));
	}
}
public class Example1{
	
	public static void main(String[] args) {
		
		Interface1 i=(x,y)->System.out.println("Addition of 2 numbers:  "+(x+y));
		i.add(10, 20);
		Interface1.sub(100, 10);
		i.mul(2, 5);
		
	}

}
