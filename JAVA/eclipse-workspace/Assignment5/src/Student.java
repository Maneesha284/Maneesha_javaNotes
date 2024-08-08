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
		
		if(mathsMarks >= 35 && scienceMarks >= 35 && socialMarks >= 35 && englishMarks >= 35 && hindiMarks >= 35) {
			
			int totalMarks = mathsMarks + scienceMarks + socialMarks + englishMarks + hindiMarks;
			int average =totalMarks / 5;

			if(average >= 85)
				System.out.println("Distinction");
			else if(average >= 70)
				System.out.println("First class");
			else if(average >= 60)
				System.out.println("Second class");
			else
				System.out.println("Third class");
			
		}
		else {
			System.out.println("Student is failed");
		}
		
	}

}
