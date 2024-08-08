
public class BiggestNumber {

	public static void main(String[] args) {
		if(args.length != 5) {
			System.out.println("Invalid argumnets \n please enter 5 values");
			return;
		}
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			
			
			if(value1 < value2) {
				value1 = value2;
			}
			value2 = Integer.parseInt(args[2]);
			
			if(value1 < value2) {
				value1 = value2;
			}
			value2 = Integer.parseInt(args[3]);
			
			if(value1 < value2) {
				value1 = value2;
			}
			value2 = Integer.parseInt(args[4]);
			
			if(value1 < value2) {
				value1 = value2;
			}
			
			System.out.println(value1);
			
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter numbers!");
		}

	}

}
