import java.io.File;

public class Demo1 {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\mr21204");
		if(f.isDirectory()) {
			System.out.println("It is a Directory");
			String file[] = f.list();
			for(String s: file) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("It is not a Directory ");
		}
		
		
		
		/*File f=new File("D:\\com\\ojas");
		if(f.isDirectory()) {
			System.out.println("It is Directory");
		}
		else {
			System.out.println("It is not Directory ");
		}*/
		
		
		
		/*File f=new File("D:\\Test.java");
		if(f.isFile()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}*/

	}

}
