
public class AlarmClock {

	public static void main(String s[]) {
		try{
			int no1 = Integer.parseInt(s[0]);
			boolean b1 = Boolean.parseBoolean(s[1]);
			if(no1 > 6){
				System.out.println("error");
			}
			if((no1 == 1 || no1 == 2 ||no1 == 3 || no1 == 4 || no1 == 5) && (b1 == true)){
				System.out.println("10:00");
			}
			else if((no1 == 0 || no1 == 6) && (b1 == true)){
				System.out.println("off");
			}
			else if((no1 == 1 || no1 == 2 || no1 == 3 || no1 == 4 || no1 == 5) && (b1 == false)){
				System.out.println("7:00");
			}
			else if((no1 == 0 || no1 == 6) && (b1 == false)){
				System.out.println("10:00");
			}
		}
		catch(Exception e){
			System.out.println("error");
		}

	}

}
