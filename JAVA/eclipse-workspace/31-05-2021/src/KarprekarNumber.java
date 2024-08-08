import java.util.Scanner;

public class KarprekarNumber {

	public static String isKarprekarNumber(int num) {
		String result="";
		int temp,count=0,square,sum=0,rem,quo;
		temp=num;
		square=num*num;
		while(num!=0){
			count++;
			num=num/10;
		}
		rem = square % ((int)Math.pow(10, count));
	    quo = square / ((int)Math.pow(10, count));
	    sum = rem+quo;
	    if(sum==temp)
	 		result="True";
	    else
	       result="False";
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sr.nextInt();
		String str = "";
		if (num < 0)
			str = "-1";
		else if (num == 0)
			str = "-2";
		else
			str = isKarprekarNumber(num);
		System.out.println(str);

	}

}
