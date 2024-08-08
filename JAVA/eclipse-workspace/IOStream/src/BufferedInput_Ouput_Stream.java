import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInput_Ouput_Stream {

	public static void main(String[] args) {
		try {
			BufferedInputStream fis=new BufferedInputStream(new FileInputStream("C:\\Users\\mr21204\\eclipse-workspace\\IOStream\\src\\Demo1.java"));
			BufferedOutputStream fos= new BufferedOutputStream(new FileOutputStream("abc1.txt"));
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
