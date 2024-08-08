import java.util.Scanner;

public class SumOfAllArmstrongNums {

	static int getSumOfAllArmstrongNums(int startNum, int endNum) {
		int result = 0, sum = 0;
		if (startNum<0|| endNum<0) {
			result = -1;
		} 
		else if (startNum==0|| endNum==0) {
			result = -2;
		} 
		else if (startNum > endNum) {
			result = -3;
		}
		else {
			for(int i=startNum;i<endNum;i++) {
				
				if(isArmstrong(startNum)) {
					System.out.println(startNum);
					result +=i;
				}
			}
			
		}
		return result;
	}
	static boolean isArmstrong(int startNum) {
		boolean b=false;
		int armCheck = sumOfPowerOfDigits(startNum);

		if (startNum == armCheck) {
			if (containsAllOddDigits(startNum)) {
				b = true;
			}
		}
        return b;
            
    }
	static boolean containsAllOddDigits(int num) {
		boolean b = true;
		int[] arr = getDigits(num);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				b = false;
			}
		}

		return b;
	}

	static int[] getDigits(int num) {
		String str = Integer.toString(num);
		int[] arr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}

		return arr;
	}

	static int sumOfPowerOfDigits(int num) {
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum += rem * rem * rem;
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		int startNum = sr.nextInt();
		int endNum = sr.nextInt();
		System.out.println(getSumOfAllArmstrongNums(startNum,endNum));

	}


}
