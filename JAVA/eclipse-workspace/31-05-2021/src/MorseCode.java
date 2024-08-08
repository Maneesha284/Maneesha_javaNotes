import java.util.Scanner;

public class MorseCode {
	static String getMorseCode(String morse) {
		String result="";
		char ch[]=morse.toCharArray();
		for(int i=0;i<morse.length();i++) {
			switch(ch[i]) {
			case 'a': result += ".-"; 
				break;
			case 'b': result += "-...";
				break;
			case 'c': result += "-.-."; 
				break;
			case 'd': result += "-.."; 
				break;
			case 'e': result += ".";
				break;
			case 'f': result += "..-.";
				break;
			case 'g': result += "--."; 
				break;
			case 'h': result += "...."; 
				break;
			case 'i': result += ".."; 
				break;
			case 'j': result += ".---";		
				break;
			case 'k': result += "-.-"; 
				break;
			case 'l': result += ".-..";
				break;
			case 'm': result += "--";
				break;
			case 'n': result += "-."; 
				break;
			case 'o': result += "---"; 
				break;
			case 'p': result += ".--.";
				break;
			case 'q': result += "--.-";
				break;
			case 'r': result += ".-."; 
				break;
			case 's': result += "..."; 
				break;
			case 't': result += "-";
				break;
			case 'u': result += "..-";
				break;
			case 'v': result += "...-"; 
				break;
			case 'w': result += ".--";
				break;
			case 'x': result += "-..-";
				break;
			case 'y': result += "-.--";
				break;
			case 'z': result += "--..";
				break;
			default: result += "Invalid Letters";
				break;
			
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter String for time");
		String morse = sr.next();
		String str = "";
		if (morse.isBlank())
			str = "Null String";
		else if (morse.isEmpty())
			str = "Empty String";
		else if (morse.contains("[0-9]+[!@#$%&*()_+=|<>?{}\\[\\]~-]"))
			str = "Invalid Letters";
		else
			str = getMorseCode(morse);
		System.out.println(str);
	}

}
