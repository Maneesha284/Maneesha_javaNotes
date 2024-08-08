import java.util.*;
class Anagram20                    
{
	public static void main(String[] args) 
	{
		//Ex: Str1= reaction Str2: creation  ANAGRAM
		Scanner sr=new Scanner(System.in);

		System.out.println("Enter String1:");
		String str1=sr.next();
		char ch1[]=str1.toCharArray();
		int len1=str1.length();

		System.out.println("Enter String2:");
		String str2=sr.next();
		char ch2[]=str2.toCharArray();
		int len2=str2.length();
		int flag=0;
		if(len1!=len2) {
			System.out.println("not anagram");
			System.exit(0);
		}
		for(int i=0;i<len1;i++) {
			int count=0;
			for(int j=0;j<len2;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
				}
			}
			if(count==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("not anagram");
		}
		else{
			System.out.println("anagram");
		} 
	}
}