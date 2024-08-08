
public class BooleanValue {
	public static void main(String s[]) {
		try{
			boolean b1 = Boolean.parseBoolean(s[0]);
			boolean b2 = Boolean.parseBoolean(s[1]);
			boolean b3 = Boolean.parseBoolean(s[2]);
			if(((b1 == true) && (b2 == true)) || ((b2 == true) && (b3 == true))||((b1 == true) && (b3 == true))){
				System.out.println("true");
			}
			else if((b1 == true) || (b2 == true) || (b3 == true)){
				System.out.println("false");
			}
		}
		catch(Exception e){
			System.out.println("error");
			System.exit(0);
		}
	}

}