import java.io.*;

public class BuffereReader2 {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter ur name");
		String name= br.readLine();
		System.out.println("Your name is: "+name);
	}

}
