package functionalinterface;
interface Interf1{
	public void calc(int b);
}
public class FunctionalInterface3 {

	public static void main(String[] args) {
		Interf1 i=(num)->{
			if(num%2==0) 
				System.out.println("Even num");
			else
				System.out.println("Odd num");
		};
		i.calc(82);
	}

}
