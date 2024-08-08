import java.io.*;

public class SequanceInput_Ouput_Stream {

	public static void main(String[] args) {
		try {
			FileInputStream fis1=new FileInputStream("abc.txt");
			FileInputStream fis2=new FileInputStream("C:\\Users\\mr21204\\eclipse-workspace\\IOStream\\src\\Employee.txt");
			FileOutputStream fos= new FileOutputStream("result.txt");
			SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
			int i=0;
			while((i= sis.read()) != -1) {
				fos.write((char)i);
				System.out.print((char)i);
				
			}
			fos.close();
			fis2.close();
			fis1.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
