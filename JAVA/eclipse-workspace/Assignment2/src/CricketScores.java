import java.util.Scanner;

public class CricketScores {
	public String getDisplayDetails(int runs,float overs) {   //130 20.4
		float dec = overs % 1;        //0.4
		System.out.println(dec);
		int no = (int) (dec * 10);     //4
		//System.out.println(no);
		
		int balls = (int)overs * 6;      //20*6=120
		int oversTotal = balls + no;      //120+4     
		//System.out.println(oversTotal);
		
		if(balls < 100 || oversTotal < 100)
			return  runs+" runs in "+balls +" balls @ "+(runs / balls) +" runs per ball";
		else
			return  runs+" runs in "+oversTotal +" balls @ "+(runs / overs) +" runs per ball";
	}
	public static void main(String s[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter input value");
		int runs = sr.nextInt();
		float overs = sr.nextFloat();
		CricketScores cs = new CricketScores();
		System.out.println(cs.getDisplayDetails(runs, overs));
		
	}

}
