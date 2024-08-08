
public class Sum {
	static int multiple1 = 0, multiple2 = 0, multiple3 = 0;
	public int multipleNo(int no1, int no2, int no3) {
		if(no1 == 0) {
			multiple1 = no1;
		}
		else {
			int i = no1 / 10;
			multiple1 = (i + 1) * 10;
		}
		if(no2 == 0) {
			multiple2 = no2;
		}
		else {
			int j = no2 / 10;
			multiple2 = (j + 1) * 10;
			}
		if(no3 == 0) {
			multiple3 = no3;
		}
		else {
			int k = no3 / 10;
			multiple3 = (k + 1) * 10;
		}
		return multiple1 + multiple2 + multiple3;
	}
	public static void main(String  s[]) {
		
		try{
			int no1 = Integer.parseInt(s[0]);
			int no2 = Integer.parseInt(s[1]);
			int no3 = Integer.parseInt(s[2]);
			Sum s1 = new Sum();
			System.out.println(s1.multipleNo(no1, no2, no3));
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
}
