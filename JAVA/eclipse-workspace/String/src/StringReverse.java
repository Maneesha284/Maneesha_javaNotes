
public class StringReverse {

	public static void main(String[] args) {
		String input = "Welcome to Java";
		input = input.toLowerCase();
		String str[] = input.split(" ");
		String result="";
		
		for (String x : str) {
			StringBuffer sb = new StringBuffer(x);
			String rev = sb.reverse().toString();
			result+=rev.substring(0,1).toUpperCase()+rev.substring(1)+" ";
		}
		
		System.out.print(result);
		
	}

}




