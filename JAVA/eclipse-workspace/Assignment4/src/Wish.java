
public class Wish {
	
	public static void main(String[] args) {
		
		String meridiem = args[0]; 
		String name = args[1];
		
		if (meridiem.equals("AM")) 
			System.out.println("Good Morning " +name);
		else if (meridiem.equals("PM"))
			System.out.println("Good Evening " +name);
		else
			System.out.println("First argument should be either 'AM' or 'PM'");
		
	}
	
}
