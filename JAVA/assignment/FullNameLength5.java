import java.util.Scanner;

public class FullNameLength5 {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter full name of any person");
		String name=sr.nextLine();
		int count =0;
		char ch[]=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if(ch[i]!=' ') {
				count++;
			}
		}
		System.out.println("Length of the person name: "+count);
		
		//System.out.println("Length of the person name: "+name.length());
	}
}
