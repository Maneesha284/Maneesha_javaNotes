
public class Pattern6 {

	public static void main(String[] args) {
		int temp = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(j>=1 && j<=i) {
					System.out.print(temp++ +"  ");
				}
			}
			System.out.println();
		}

	}

}
