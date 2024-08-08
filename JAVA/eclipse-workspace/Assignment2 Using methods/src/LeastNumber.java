public class LeastNumber {
	public int greatNum(int no1, int no2) {
		if(no1 >= no2)
			return no2;
		else
			return no1;
	}
	public static void main(String s[]) {
		try{
			LeastNumber lno = new LeastNumber();
			System.out.println(lno.greatNum(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}
