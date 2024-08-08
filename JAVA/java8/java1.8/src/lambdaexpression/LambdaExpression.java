package lambdaexpression;

@FunctionalInterface
interface Interf {
	public void display();
	default void sub1() {
		System.out.println("FI sub1");
	}
	default void sub2() {
		System.out.println("FI sub2");
	}
	public static void mul1() {
		System.out.println("FI mul1");
	}
	public static void mul2() {
		System.out.println("FI mul2");
	}
}
@FunctionalInterface
interface Interf1 {
	public int add(int a, int b);
}
public class LambdaExpression implements Interf,Interf1 {
	public static void main(String[] args) {
		Interf i = () -> {
			System.out.println("Display Method1");
		};
		Interf ii = () -> {
			System.out.println("Display Method2");
		};
		Interf1 i1 = (a, b) -> {
			return a + b;
		};
		i.display();
		ii.display();
		System.out.println(i1.add(10, 2));
		Interf iii = () -> {
			System.out.println("Display Method");
		};
		LambdaExpression e = new LambdaExpression();
		e.sub1();
		Interf.mul1();
	}
	@Override
	public void display() {
		System.out.println("Override display");
	}
	public void sub1() {
		System.out.println("class sub1");
	}
	@Override
	public int add(int a, int b) {
		a=10;b=20;
		
		return a+b;
	}
}
