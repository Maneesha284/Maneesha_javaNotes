import java.io.*;
public class BufferedReader1 {

	public static void main(String[] args) {
		String fname = "C:\\Users\\mr21204\\eclipse-workspace\\IOStream\\abc.txt";
		try {
			FileReader fr = new FileReader(fname);
			BufferedReader br =new BufferedReader(fr);
			int count = 0;
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				else {
					String words[]=line.split(" ");
					for(String w: words) {
						if(w.length() !=0) {
							count++;
						}
					}
				}
			}
			System.out.println("No.of words: "+count);
			br.close();
			fr.close();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
