import java.util.List;
import java.util.Scanner;

public class BinarySearchNew {

	public static void main(String[] args) {
		//int list[] = {4,3,8,5,6,2,1,9};
		int list[] =new int[6];
		Scanner sr=new Scanner(System.in);
		for(int i=0;i<list.length;i++) {
			list[i]=sr.nextInt();
		}
		int se=3;
		
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>=list[j]) {
					int temp = list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		System.out.println("sotred list");
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
		int low=0,high=list.length-1,mid=0,flag=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(list[mid]==se) {
				flag=1;
				break;
			}
			else if(list[mid] > se) {  //5>3  //1 2 3 4 5 6 7 8 9
				high=mid-1;
			}
			else if(list[mid]<se) { //5<3
				low=mid+1;
			}
		}
		if(flag==1) {
			System.out.println("\n"+se+" fond position at "+mid);
		}
		else {
			System.out.println("\n"+se+"not fond position ");

		}
	}

}
