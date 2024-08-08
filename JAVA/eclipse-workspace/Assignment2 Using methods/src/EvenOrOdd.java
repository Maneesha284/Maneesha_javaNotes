
public class EvenOrOdd {
	public String checkEvenOrOdd(int no) {
		if(no % 2 == 0)
			return "Even number";
		else 
			return "Odd number";
	}
	public static void main(String s[]) {
		try{
			EvenOrOdd e1 = new EvenOrOdd();
			System.out.println(e1.checkEvenOrOdd(Integer.parseInt(s[0])));
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
