import java.util.Scanner;

public class Decrypted {
	  
	    public static String decrypt(String s) {
	        String res = "";
	        for (int i = 0; i < s.length(); i++) {
	            int index = 'a' - s.charAt(i);
	            res += (char) ('z' + index);
	        }
	        System.out.println(res);
	        return res;
	    }	 

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str = sc.next();
	        str = str.toLowerCase();
	        decrypt(str);

	 

	    }

}