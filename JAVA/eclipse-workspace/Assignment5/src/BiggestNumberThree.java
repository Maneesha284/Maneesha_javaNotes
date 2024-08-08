
public class BiggestNumberThree {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Invalid argumnets \n please enter 3 values");
			return;
		}
		
		try {
			if( Integer.parseInt(args[0]) < Integer.parseInt(args[1]) )
				System.out.println("The Biggest number is: " +Integer.parseInt(args[1]));
			else if(Integer.parseInt(args[2]) < Integer.parseInt(args[0]))
				System.out.println("The Biggest number is: " +Integer.parseInt(args[0]));
			else
				System.out.println("The Biggest number is: " +Integer.parseInt(args[2]));
			
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter numbers!");
		}

	}

}
