
public class Pattern8 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			int temp = 5;
			for(int j = 1; j <= 5; j++) {
				if(j >= 1 && j <= 6 - i) {
					System.out.print(temp-- +"  ");
				}
			}
			System.out.println();
		}

	}

}
