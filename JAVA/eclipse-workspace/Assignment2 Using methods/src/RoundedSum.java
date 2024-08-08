
public class RoundedSum {
	public int roundSum(int no1,int no2,int no3) {
		int multiple1 = 0, multiple2 = 0, multiple3 = 0;
		int l = no1 % 10;
		int m = no2 % 10;
		int n = no3 % 10;	
		if(no1 == 0 || l < 5) {
			multiple1 = no1 - l;
		}
		else {
			int i = no1 / 10;
			multiple1 = (i + 1) * 10;
		}
		if(no2 == 0 || m < 5) {
			multiple2 = no2 - m;
		}
		else {
			int j = no2 / 10;
			multiple2 = (j + 1) * 10;
		}
		if(no3 == 0 || n < 5) {
			multiple3 = 0;
		}
		else {
			int k = no3 / 10;
			multiple3 = (k + 1) * 10;
		}
		return multiple1 + multiple2 + multiple3;
	}
	public static void main(String  s[]) {
		
		try{
			RoundedSum rm = new RoundedSum();
			System.out.println(rm.roundSum(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])));
		}
		catch(Exception e){
			System.out.println("error");
		}
	}

}
