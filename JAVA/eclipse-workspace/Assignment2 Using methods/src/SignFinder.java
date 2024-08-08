
public class SignFinder {
	public String find(int no) {
		if(no == 0)
			return "Zero";	
		else if(no > 0)
			return "Positive Value";
		else 
			return "Negative Value";
	}
	public static void main(String s[]) {
		SignFinder sf = new SignFinder();
		try{
			System.out.println(sf.find(Integer.parseInt(s[0])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
