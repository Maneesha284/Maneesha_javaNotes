import java.util.Scanner;

public class Student {
	int sno;
	String name;
	int marks[] = new int[5];
	Scanner sr = new Scanner(System.in);

	public
	static void main(String[] args) {

		Student std = new Student();
		std.accept(std.sno, std.name, std.marks);
		std.display();
		System.out.println(std.findGrade());

	}

	public void accept(int sno, String name, int marks[]) {
		System.out.println("Enter sno, and name");
		
		
		this.sno = sr.nextInt();
		  this.name = sr.next();
		   System.out.println("Enter 5 sybject marks");
		  for (int i = 0; i < marks.length; i++) {
			marks[i] = sr.nextInt();
		  }

	}

	public void display() {
		System.out.println("sno: " + sno + "  name: " + name);
	}

	public String findGrade() {
		String result = "";

		if (marks[0] >= 35 && marks[1] >= 35 && marks[2] >= 35 && marks[3] >= 35 && marks[4] >= 35) {

			int totalMarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
			result += "Total: " + totalMarks + "\n";
			int average = totalMarks / 5;
			result += "Äverage: " + average + "\n";
			if (average >= 85)
				result += "Distinction";
			else if (average >= 70)
				result += "First class";
			else if (average >= 60)
				result += "Second class";
			else
				result += "Third class";

		}
		else {
			result = "Student is failed";
		}

		return result;

	}

}
