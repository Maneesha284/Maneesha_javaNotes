
public class BooleanValue {
	public boolean result(boolean b1, boolean b2, boolean b3) {
		if(((b1 == true) && (b2 == true))||((b2 == true) && (b3 == true))||((b1 == true) && (b3 == true)))
			return true;
		else if((b1 == true) || (b2 == true) || (b3 == true)) 
			return false;
		else
			return false;
	}
	public static void main(String s[]) {
		try{
			boolean b1 = Boolean.parseBoolean(s[0]);
			boolean b2 = Boolean.parseBoolean(s[1]);
			boolean b3 = Boolean.parseBoolean(s[2]);
			BooleanValue bv = new BooleanValue();
			System.out.println(bv.result(b1, b2, b3));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}