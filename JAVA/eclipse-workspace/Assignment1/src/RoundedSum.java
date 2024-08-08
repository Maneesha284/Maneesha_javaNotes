
public class RoundedSum {

	public static void main(String  s[]) {
		int multiple1=0, multiple2=0,multiple3=0;
		try{
			int no1 = Integer.parseInt(s[0]);
			int no2 = Integer.parseInt(s[1]);
			int no3 = Integer.parseInt(s[2]);
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
			System.out.println(multiple1 + multiple2 + multiple3);
		}
		catch(Exception e){
			System.out.println("error");
		}
	}

}
