package studentPackage;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	@Override
	public int getPercentage() {
		System.out.println("Enter historyMarks, civicsMarks");
		historyMarks = sr.nextInt();
		civicsMarks= sr.nextInt();
		int total = historyMarks+civicsMarks;
		int percentage = total/3;
		return percentage;
	}
	
	
}
