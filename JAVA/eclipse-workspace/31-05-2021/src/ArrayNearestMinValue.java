import java.util.Scanner;

public class ArrayNearestMinValue {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		int min[] = new int[7];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < min.length; i++) {
			min[i] = sr.nextInt();
		}
		for(int i=0;i<min.length;i++) {
			if(min[i]>min[i+1]) {
				int temp=min[i+1];
				min[i+1]=min[i];
				min[i]=temp;
			}
		}
		System.out.println("The nearst array minimum value: "+(min[0]-1));
		
	}
}
