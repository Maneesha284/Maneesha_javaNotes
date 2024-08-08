package functionalinterface;
//interface Inter{
//	public String display(); 
//}
//public class FIReturnType1 {
//
//	public static void main(String[] args) {
//		Inter i=()->{
//			return "mani";
//			
//		};
//		System.out.println(i.display());
//
//	}
//
//}

//@FunctionalInterface
//interface Inter{
//	public String display(String str); 
//	
//}
//public class FIReturnType1 {
//
//	public static void main(String[] args) {
//		Inter i=(str)->{
//			return "manee"+str;
//			
//		};
//		System.out.println(i.display("sha"));
//	}
//
//}

@FunctionalInterface
interface Inter{
	public String display(String str); 
	
}
public class FIReturnType1 {

	public static void main(String[] args) {
		Inter i=(str1)->{
			String str2=" sha";
			String str3=str1+str2;
			return str3;
			
		};
		System.out.println(i.display("mani"));
	}

}
