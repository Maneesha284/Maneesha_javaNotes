import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter student marks");
		int mathsMarks = sr.nextInt();
		int scienceMarks = sr.nextInt();
		int socialMarks = sr.nextInt();
		int englishMarks = sr.nextInt();
		int hindiMarks = sr.nextInt();
		String result = "";
		
		if(mathsMarks >= 35 && scienceMarks >= 35 && socialMarks >= 35 && englishMarks >= 35 && hindiMarks >= 35) {
			
			int totalMarks = mathsMarks + scienceMarks + socialMarks + englishMarks + hindiMarks;
			result += "Total: " + totalMarks +"\n";
			int average =totalMarks / 5;
			result += "Äverage: " + average +"\n";
			if(average >= 85)
				result += "Distinction";
			else if(average >= 70)
				result += "First class";
			else if(average >= 60)
				result += "Second class";
			else
				result += "Third class";
			
		}
		else {
			result = "Student is failed";
		}
		
		System.out.println(result);
	}

}
