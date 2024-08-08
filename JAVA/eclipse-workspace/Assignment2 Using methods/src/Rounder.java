
public class Rounder {
	public void round(int no) {
		if(no < 0){
			System.out.println("Error");
		}
		else if(no % 2 != 0){
			System.out.println(no);
		}
		else if(no % 2 == 0){
			int i = no / 10;
			int multiple = (i + 1) * 10;
			System.out.println(multiple);
		}
	}
	public static void main(String s[]) {
		try{
			Rounder r1 = new Rounder();
			r1.round(Integer.parseInt(s[0]));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
