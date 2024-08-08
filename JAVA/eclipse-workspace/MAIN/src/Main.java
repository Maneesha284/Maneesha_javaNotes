import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter no.of arrays");
		int noOfArrays = sr.nextInt();
		List<String> inputByLine = new ArrayList<String>(noOfArrays);
		System.out.println("Enter array's sizes");
		for (int i = 0; i < noOfArrays; i++) {
			inputByLine.add(sr.next());
		}
		List<Integer> newList = new ArrayList<Integer>(inputByLine.size());
		for (String newValue : inputByLine) {
			newList.add(Integer.valueOf(newValue));
		}
		System.out.println(newList);
		int arr[];
		int even=0, odd=0;
		for (int i = 0; i < newList.size(); i++) {
			arr = new int[newList.get(i)];
			System.out.println("Enter elements into an array");
			for (int j = 0; j < newList.get(i); j++) {
				arr[j] = sr.nextInt();
			}
			System.out.println("=================");
			
			for (int j = 0; j < newList.get(i); j++) {
				if(i==0) {
					if(arr[j] %2 ==0) {
						even++;
					}
				}
			}
			for (int j = 0; j < newList.get(i); j++) {
				if(i==1) {
					if(arr[j] %2 !=0) {
						odd++;
					}
				}
			}
		}
		System.out.println("No of Enen elements into first array: "+even);
		System.out.println("No of Odd elements into second array: "+odd);
		
		
		

	}

}
