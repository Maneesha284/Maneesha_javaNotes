import java.util.Scanner;

public class student {
	static void displayMarks(int marks[]) {
		System.out.println("Marks list:");
		for(int i = 0; i < marks.length ; i++) {
			System.out.print(marks[i] +"\t");
		}
		System.out.println();
	}
	static boolean isPass(int marks[]) {
		boolean b= false;
		for(int i = 0; i < 5 ; i++) {
			if(marks[0] >= 35 && marks[1] >= 35 && marks[2] >= 35 && marks[3] >= 35 && marks[4] >= 35) {
				b = true;
			}
			else {
				b = false;
			}
		}
		return b;
		
	}
	static int calTotal(int marks[]) {
		int total = 0;
		for(int i = 0; i < 5 ; i++) {
			total += marks[i];
		}
		return total;
		
	}
	static String findGrade(int avg) {
		String grade = "";
		if(avg >= 85)
			grade = "Distinction";
		else if(avg >= 70)
			grade = "First class";
		else if(avg >= 60)
			grade = "Second class";
		else
			grade = "Third class";
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int marks[] = new int[5];
		System.out.println("Enter student marks:");
		for(int i = 0; i < 5 ; i++) {
			marks[i] = sr.nextInt();
		}
		displayMarks(marks);
		boolean b = isPass(marks);
		if(b == true) {
			int total = calTotal(marks);
			System.out.println("Total of Marks:  "+total);
			int average = total / 5;
			String result = findGrade(average);
			System.out.println("Grade:  "+result);
		}
		else {
			System.out.println("Student is failed");
		}
		
	}

}
