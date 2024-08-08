
public class EvenOrOdd {

	public static void main(String s[]) {
		try{
			int no = Integer.parseInt(s[0]);
			if(no % 2 == 0){
				System.out.println("Even number");
			}
			else if(no % 2 != 0){
				System.out.println("Odd number");
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
