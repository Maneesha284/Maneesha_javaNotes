package functionalinterface;
//with return statement

interface Interf4{
	public int add(int a,int b);
}
public class FunctionalInterface4 {

	public static void main(String[] args) {
		Interf4 i=(x,y)->{
			return (x+y);
		};
		System.out.println(i.add(4, 6));

	}

}

//without return statement


//interface Interf4{
//	public int add(int a,int b);
//}
//public class FunctionalInterface4 {
//
//	public static void main(String[] args) {
//		Interf4 i=(x,y)->(x+y);
//		System.out.println(i.add(5, 6));
//
//	}
//
//}
