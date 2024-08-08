import java.io.File;

public class Demo2 {
	static void displayFiles(String dirName) {
		File f=new File(dirName);
		if(f.isDirectory()) {
			String fileSub[] = f.list();
			for(String x: fileSub) {
				String path = dirName+"/"+x;
					File file = new File(path);
					if (file.isDirectory()) {
						displayFiles(path);
					}
					System.out.println(path);
			}
		}
		else {
			System.out.println("It is not a Directory ");
		}
	}
	public static void main(String[] args) {
		displayFiles("C:\\Users\\mr21204\\eclipse-workspace");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		File f = new File("C:\\Users\\mr21204");
		if (f.isDirectory()) {
			System.out.println("It is a Directory");
			String file[] = f.list();
			for (String s : file) {
				File f1 = new File("C:\\Users\\mr21204\\eclipse-workspace");
				if (f1.isDirectory()) {
					System.out.println("It is a Directory");
					String file1[] = f1.list();
					for (String s1 : file1) {
						System.out.println(s1);
					}
				} 
				else {
					System.out.println("It is not a Directory ");
				}
			}
		} 
		else {
			System.out.println("It is not a Directory ");
		}
	}*/


