import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Input_Ouput_Stream {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\mr21204\\eclipse-workspace\\IOStream\\src\\Demo1.java");
			FileOutputStream fos= new FileOutputStream("abc.txt");
			int i=0;
			while((i= fis.read()) != -1) {
				fos.write((char)i);
				System.out.print((char)i);
				
			}
			fos.close();
			fis.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
