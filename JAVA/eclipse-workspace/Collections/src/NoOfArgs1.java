
public class NoOfArgs1 {
	public static int biggest(int a,int... num) {
		System.out.println("Array size:  " + num.length);
		int big=a;
		for (int i : num) {
			if(i>big) {
				big=i;
			}
		}
		return big;
	}

	
	public static void main(String[] args) {
		System.out.println(biggest(1, 2, 3, 4, 5, 6, 7, 8));
		
	}
	
}
