
public class SignFinder {

	public static void main(String s[]) {
		try{
			int no = Integer.parseInt(s[0]);
			if(no == 0){
				System.out.println("Zero");
			}
			else if(no > 0){
				System.out.println("Positive Value");
			}
			else if(no < 0){
				System.out.println("Negative Value");
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
