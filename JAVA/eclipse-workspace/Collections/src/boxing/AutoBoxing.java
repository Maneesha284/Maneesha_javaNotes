package boxing;

public class AutoBoxing {

	public static void main(String[] args) {
		int a=10,b=20;
		Integer c=sum(a,b);
		System.out.println(c);
	}

	public static int sum(Integer a, Integer b) {
		Integer sum=a+b;
		return sum;
	}

}
