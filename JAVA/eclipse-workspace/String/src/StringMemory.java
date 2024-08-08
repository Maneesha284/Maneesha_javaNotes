
public class StringMemory {

	public static void main(String[] args) {
		String str=new String("Hello");
		
		String s=str.intern();
		
		System.out.println(s==str);
		System.out.println(s.equals(str));
		
		String x="Hello";
		
		System.out.println(s==x);
		System.out.println(s.equals(x));

	}

}
