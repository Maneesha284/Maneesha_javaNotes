import java.util.Scanner;

public class Student1 {
	int sno;
	String sname;

	Student1(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
		System.out.println("Two parameterized constructor");
	}

	void displayStudent() {

		System.out.println("sno " + sno + " sname: " + sname);

	}

	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		Student1 s[] = new Student1[5];
		System.out.println("Enter student details");

		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter" + (i + 1) + "student details");
			s[i] = new Student1(sr.nextInt(), sr.next());
		}
		System.out.println("Student information");
		for (int i = 0; i < s.length; i++) {
			s[i].displayStudent();
		}
	}
}
