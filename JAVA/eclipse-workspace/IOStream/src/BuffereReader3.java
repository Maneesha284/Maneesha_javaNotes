import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BuffereReader3 {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw= new FileWriter("tables.csv",true);
		System.out.println("Enter any number for table");
		String num= br.readLine();
		String table ="";
		for(int i=1;i<=10;i++) {
			table += num +" * " +i +" = " +Integer.parseInt(num)*i +"\n";
			
		}
		System.out.println(table);
		fw.write(table);
		fw.flush();
		fw.close();
		br.close();
		isr.close();
		
	}

}
