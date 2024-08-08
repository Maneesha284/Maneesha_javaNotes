
public class Accurate1 {

	public static void main(String[] args) {
		String strArray[] = { "[5,7,3]", "[1,2,9]" };//573
		int arr1[] = covertStringtoInteger(strArray[0]);
		int arr2[] = covertStringtoInteger(strArray[1]);

		int result[] = new int[arr1.length];

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				result[i] = arr1[i] + arr2[i];
				
			}
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(result[i] + " ");
			}
		} else {
			System.out.println("not able to add");
		}

		
	}

	private static int[] covertStringtoInteger(String str) {
		str = str.substring(1,str.length()-1);
		String strArray[]=str.split(",");
		int arr[]=new int[strArray.length];
		for(int i=0;i<strArray.length;i++) {
			arr[i]=Integer.parseInt(strArray[i]);
		}
		return arr;
	}

}
