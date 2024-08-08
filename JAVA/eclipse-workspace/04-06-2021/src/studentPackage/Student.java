package studentPackage;

import java.util.Scanner;

public abstract class Student {
	static String studentName;
	String studentClass;
	protected static int totalNoOfStudents;
	public abstract int getPercentage();
	Scanner sr =new Scanner(System.in);
	static void getTotalNoStudents() {
		totalNoOfStudents = 2;
	}
	public Student() {
		System.out.println("Student constrctor");
	}
	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	public static void main(String[] args) {
		System.out.println("Enter student name, student Class");
		//studentName = sr.next();
		Student obj = new ScienceStudent();
		System.out.println("ScienceStudent Percentage: "+obj.getPercentage());
		obj=new HistoryStudent();
		System.out.println("HistoryStudent Percentage: "+obj.getPercentage());
	}

}
