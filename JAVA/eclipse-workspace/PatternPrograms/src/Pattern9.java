
public class Pattern9 {

	public static void main(String[] args) {
		int a = 65;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j>=1 && j<=i) {
					System.out.print((char)a++ +"  ");
				}
			}
			System.out.println();
		}

	}

}
