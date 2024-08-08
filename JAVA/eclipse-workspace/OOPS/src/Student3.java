import java.util.Scanner;

public class Student3 {
	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	Student3() {
		System.out.println("Default constructor");
	}

	Student3(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public String toString(){

		return "Student Id: " + studentId + "\nStudent Name: " + studentName + "\nMarks: " + marks;
	}

	private char calculateGrade() {
		if (marks >= 90)
			grade = 'A';
		else if (marks >= 80 && marks < 90)
			grade = 'B';
		else if (marks >= 70 && marks < 80)
			grade = 'C';
		else if (marks >= 60 && marks < 70)
			grade = 'D';
		else if (marks < 60)
			grade = 'E';
		return grade;
	}
	public String displayDetails() {

		
		return toString();
	}

	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter studentId, studentName and marks");
		Student3 s1 = new Student3(sr.nextInt(), sr.next(), sr.nextInt());

		System.out.print(s1.displayDetails());

	}
}