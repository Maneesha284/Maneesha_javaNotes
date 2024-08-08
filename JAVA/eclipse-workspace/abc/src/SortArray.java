

public class SortArray {

	public static void main(String[] args) {
		int a[] = {5, 9 , 2 , 1, 4, 8};
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= a[i+1]) {
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
