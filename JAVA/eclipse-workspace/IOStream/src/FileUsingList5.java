import java.io.*;

public class FileUsingList5 {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\mr21204\\eclipse-workspace\\IOStream");
		if(f.isDirectory()) {
			String list[]=f.list();
			for(String s:list) {
				if(s.endsWith(".java")) {
					System.out.println(s);
				}
			}
		}
		else{
			System.out.println("Not a Directory");
		}
		
		

	}

}
