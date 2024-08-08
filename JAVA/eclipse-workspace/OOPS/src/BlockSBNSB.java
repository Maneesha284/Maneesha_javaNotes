public class BlockSBNSB {
	static int num;
	int num1;
	{
		System.out.println("Non Static Block");
		num=10;
		num1=20;
	}
	BlockSBNSB(){
		System.out.println("Default constructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		BlockSBNSB obj=new BlockSBNSB();
		System.out.println(obj.num1+" "+num);
		

	}
	

}
/*public class BlockSBNSB {
	static int num;
	int num1;
	static {
		System.out.println("Static Block");
		num=20;
		
	}
	{
		System.out.println("Non Static Block");
		num1=20;
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println(num);
		

	}
	

}*/
