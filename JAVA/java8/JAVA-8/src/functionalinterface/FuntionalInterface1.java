package functionalinterface;
//interface Interf{
//	public void display();
//}
//public class FuntionalInterface1 {
//	
//	public static void main(String[] args) {
//		int a=10;
//		Interf i= new Interf() {
//			@Override
//			public void display() {
//				System.out.println("Annonymous class = "+a);
//			}
//		};
//		System.out.println("main methods");
//		i.display();
//
//	}
//
//}
interface Interf{
	public void display();
}
public class FuntionalInterface1 {	
	public static void main(String[] args) {
		int num=2;
		Interf i=()->{
			System.out.println("Lambda expression: "+num);
		};
		i.display();
	}
}
