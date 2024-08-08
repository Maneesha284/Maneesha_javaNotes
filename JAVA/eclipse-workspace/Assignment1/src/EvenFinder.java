public class EvenFinder {
	public static void main(String s[]) {
		try{
			int no = Integer.parseInt(s[0]);
			boolean b1 = (no % 2 == 0);
			System.out.println(b1);
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
