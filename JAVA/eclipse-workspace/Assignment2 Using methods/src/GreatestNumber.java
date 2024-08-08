public class GreatestNumber {
	public int greatNum(int no1,int no2) {
		if(no1 >= no2)
			return no1;
		else
			return no2;
	}
	public static void main(String s[]) {
		try{
			GreatestNumber gno = new GreatestNumber();
			System.out.println(gno.greatNum(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}
