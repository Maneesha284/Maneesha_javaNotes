class Demo{
	int a=10;
}
public class VariableDemo extends Demo{
	int a=20;
	void disp() {
		System.out.println("a: "+a+"  a: "+a);
	}
	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		obj.disp();
	}

}
