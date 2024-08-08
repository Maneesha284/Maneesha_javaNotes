import java.util.Scanner;

public class CheckCommonNameAtFirstName {

	public static void main(String args[]) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter str1:");
		String str1=sr.nextLine();
		System.out.println("Enter str2:");
		String str2=sr.nextLine();
		System.out.println("Enter str3:");
		String str3=sr.nextLine();
		System.out.println("Enter str4:");
		String str4=sr.nextLine();
		
		String s1=str1.split(" ")[0];
		String s2=str2.split(" ")[0];
		String s3=str3.split(" ")[0];
		String s4=str4.split(" ")[0];
		
		String firstNames[]= {s1,s2,s3,s4};
		int flag=0;
		for(int i=0;i<firstNames.length;i++) {
			int count=1;
			for(int j=i+1;j<firstNames.length;j++) {
				if(firstNames[i].equalsIgnoreCase(firstNames[j])) {
					count++;
					firstNames[j]="";
				}
			}
			if(count>1 && !firstNames[i].equals("")) {
				System.out.println(firstNames[i]+" name matched "+count+" "+" times");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("first names not matched");
		}
		
	}

}

//vijay kumar wata

//

//sandy vany panda

//

//sura nith kusan

//

//sravan wata vany
