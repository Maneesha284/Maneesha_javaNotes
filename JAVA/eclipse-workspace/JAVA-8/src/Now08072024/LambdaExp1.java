package Now08072024;
@FunctionalInterface
interface LambdaExpInterf {
	void print();
}
@FunctionalInterface
interface LambdaExpNames {
	void prints();
}
@FunctionalInterface
interface LambdaExpInterfAdd {
	void add(int a,int b);
}
@FunctionalInterface
interface LambdaExpInterfReturn {
	int returnobj(int a);
}
@FunctionalInterface
interface LambdaExpInterfString {
	void returnlen(String a);
}
public class LambdaExp1	{
	public static void main(String[] args) {
		LambdaExpInterf name=()->System.out.println("maneesha");
		name.print();
		LambdaExpNames names=()->{
		System.out.println("name1");
		System.out.println("name2");
		System.out.println("name3");
		};
		names.prints();
		LambdaExpInterfAdd addobj=(a,b)->System.out.println(a+b);
		addobj.add(2, 3);
		LambdaExpInterfReturn rerurnobj=(n)->n*n;
		System.out.println(rerurnobj.returnobj(2));	
		LambdaExpInterfString obj=(s)->System.out.println(s.length());
		obj.returnlen("maneesha.rayudu");	
	}
}
