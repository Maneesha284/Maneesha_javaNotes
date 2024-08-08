
public class BiggestNumberTwo {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("Invalid argumnets \n please enter 2 values");
			return;
		}
		
		try {
			if( Integer.parseInt(args[0]) < Integer.parseInt(args[1]) )
				System.out.println("The Biggest number is: " +Integer.parseInt(args[1]));
			else
				System.out.println("The Biggest number is: " +Integer.parseInt(args[0]));
			
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter numbers!");
		}

	}

}
