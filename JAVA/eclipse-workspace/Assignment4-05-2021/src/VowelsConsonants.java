import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sr =new Scanner(System.in);
		
		System.out.println("Enter any Character: ");
		char str = sr.next().toUpperCase().charAt(0);
		String result = ""; 
		if(Character.isLetter(str)) {
			boolean b = false;
			switch(str) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					b = true;
					break;
			}
			if(b)
				result = str + " is Vowel";
			else 
				result = str + " is Consonant";
		}
		System.out.println(result);
	}

}
