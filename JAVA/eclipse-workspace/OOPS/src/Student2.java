import java.util.Scanner;

public class Student2 {

	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	public Student2() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	public Student2(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	}

	public String displayDetails() {

		/*
		 * String res = ""; res = "Student" + "[" + "name" + "=" + studentName + "," +
		 * "StudentId" + "=" + studentId + "," + "marks" + "=" + marks + "," + "Grade" +
		 * "=" + grade + "]"; return res;
		 */
		return toString();
	}

	private void calculateGrade() {

		if (marks >= 90) {
			grade = 'A';
		} else if (marks >= 80 && marks < 90) {
			grade = 'B';
		} else if (marks >= 70 && marks < 80) {
			grade = 'C';
		} else if (marks >= 60 && marks < 70) {
			grade = 'D';
		} else {
			grade = 'E';
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Info");
		Student2 std = new Student2(sc.nextInt(), sc.next(), sc.nextInt());
		System.out.print(std.displayDetails());
	}

}