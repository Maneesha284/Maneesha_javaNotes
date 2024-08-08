
public class OddRounder {
	public void round(int no) {
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

	public static void main(String s[]) {
		try{
			OddRounder or = new OddRounder();
			or.round(Integer.parseInt(s[0]));
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
