
public class StringMethods1 {

	public static void main(String[] args) {
		String str="abcdefghijkl";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.indexOf("m"));
		
		byte b[]= {65,66,67,68,69};
		String str1=new String(b);
		System.out.println(str1);
		
		byte b1[]= str1.getBytes();
		
		for(byte x:b1) {
			System.out.println(x);
		}
	}
}
