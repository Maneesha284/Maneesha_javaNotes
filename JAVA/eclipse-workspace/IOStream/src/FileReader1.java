import java.io.*;
public class FileReader1 {

	public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("C:\\Users\\mr21204\\eclipse-workspace\\IOStream\\abc.txt");
		FileWriter fw=new FileWriter("mani.txt");
		int i=0;
		while((i= fr.read()) != -1) {
			fw.write((char)i);
			System.out.print((char)i);
			
		}
		fw.close();
		fr.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}
