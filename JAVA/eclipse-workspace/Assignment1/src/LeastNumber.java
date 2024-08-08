public class LeastNumber {
	public static void main(String s[]) {
		try{
			int no1 = Integer.parseInt(s[0]);
			int no2 = Integer.parseInt(s[1]);
			if(no1 >= no2){
				System.out.println(no2);
			}
			else{
				System.out.println(no1);
			}
		}
		catch(Exception e){
			System.out.println("error");
		}
	}

}
