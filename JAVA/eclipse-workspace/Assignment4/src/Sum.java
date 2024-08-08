
public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < 4 ; i++) {
			sum = sum + Integer.parseInt(args[i]);
			
		}
		
		System.out.println("Sum of four values: " +sum);

	}

}
