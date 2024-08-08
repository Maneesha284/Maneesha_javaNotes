package boxing;

public class Demo1 {

	public static void main(String[] args) {
		//jdk 1.4
		int num=10;
		System.out.println(num);
		Integer i=new Integer(num);
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
	}

}
