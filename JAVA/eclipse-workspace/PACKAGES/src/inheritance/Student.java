package inheritance;

public class Student {
	public int sno;
	public String sname;

	public Student() {
		System.out.println("Default constructor");
	}

	public Student(int sno, String sname) {
		this();
		this.sno = sno;
		this.sname = sname;
	}

	public void displayStudent() {
		System.out.println("No:	" + sno);
		System.out.println("Name:	" + sname);
	}

}
