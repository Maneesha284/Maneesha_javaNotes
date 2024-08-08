import java.util.Scanner;

public class Duplicate1 {
	public static void main(String[] args) {
		System.out.println("Enter elements into an array && don't enter zeros (0)");
		Scanner sr = new Scanner(System.in);
		int a1[] = new int[10];
		int a2[] = new int[10];
		int len = 0;
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sr.nextInt();
		}
		
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] == a1[j] && a1[i] != 0) {
					Boolean flag=false;
					for(int k=0;k<len;k++) {
						if(a2[k]==a1[i]) {
							flag=true;
							break;
						}
					}
					if(flag==false) {
						a2[len]=a1[i];
						len++;
					}
					a1[j]=0;
				}

			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(a2[i] + " ");
		}

	}
}
