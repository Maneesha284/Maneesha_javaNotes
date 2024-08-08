
public class AlarmClock {
	public String alarm(int no, boolean b) {
		if((no == 1 || no == 2 ||no == 3 || no == 4 ||no == 5) && (b == true))
			return "10:00";
		else if((no == 0 ||no == 6) && (b == true))
			return "off";
		else if((no == 1 || no == 2 ||no == 3 || no == 4 ||no == 5) && (b == false))
			return "7:00";
		else if((no == 0 ||no == 6) && (b == false))
			return "10:00";
		else
			return null;
	}
	public static void main(String s[]) {
		try{
			int no = Integer.parseInt(s[0]);
			boolean b = Boolean.parseBoolean(s[1]);	
			if(no > 6) {
				System.out.println("Error");
			}
			AlarmClock ac = new AlarmClock();
			System.out.println(ac.alarm(no, b));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
