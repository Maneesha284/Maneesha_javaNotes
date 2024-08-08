import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		
		int std[][] = new int[3][];
		std[0]=new int[3];
		std[1]=new int[2];
		std[2]=new int[1]; 
		
		System.out.println("Enter three students marks");
		Scanner sr = new Scanner(System.in);
		
		for (int i = 0; i < std.length; i++) {
			System.out.println("Enter " +(i+1)+" std "+std[i].length+" subject marks ");
			for (int j = 0; j < std[i].length; j++) {
				std[i][j]=sr.nextInt();
			}
		}
		
		System.out.println("Tree students marks");
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std[i].length; j++) {
				System.out.print(std[i][j]+" ");
			}
			System.out.println();
		}
	}

}
