package collection;
//Method reference

interface Calc{
	
	public void sum(int a,int b);
	
}
public class Example2 {
	static void saySum(int a,int b) {
		System.out.println("sum: "+(a+b));
	}

	public static void main(String[] args) {
		Calc ref=Example2::saySum;
		ref.sum(10, 20);

	}

}
