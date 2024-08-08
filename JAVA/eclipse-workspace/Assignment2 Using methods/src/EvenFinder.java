
public class EvenFinder {
	public boolean find(int no) {
		boolean b1 = (no % 2 == 0);
		return b1;
	}
	public static void main(String s[]) {
		try{
			EvenFinder ef = new EvenFinder();
			System.out.println(ef.find(Integer.parseInt(s[0])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
	
}
