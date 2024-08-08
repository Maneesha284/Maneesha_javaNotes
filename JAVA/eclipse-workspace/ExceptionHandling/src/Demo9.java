import java.io.FileInputStream;

public class Demo9 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:/Test.java");
		int ch = 0;
		while((ch=fis.read()) != -1) {
			System.out.print((char)ch);
		}
	}

}
