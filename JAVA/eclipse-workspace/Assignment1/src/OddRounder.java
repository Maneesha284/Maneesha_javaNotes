
public class OddRounder {

	public static void main(String s[]) {
		try{
			int no = Integer.parseInt(s[0]);
			if(no < 0){
				System.out.println("Negative Value");
			}
			else if(no % 2 == 0){
				System.out.println("Even number");
			}
			else if(no % 2 != 0){
				int i = no / 10;
				int multiple = (i + 1) * 10;
				System.out.println(multiple);
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
