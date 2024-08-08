
public class Studnet {
	int sno;
	String sname;

	Studnet(int sno, String sname){
		this.sno=sno;
		this.sname=sname;
		System.out.println("Two parameterized constructor");
	}
	void displayStudent() {

		System.out.println("sno " + sno + " sname: " + sname);

	}

	public static void main(String args[]) {
		Studnet s1 = new Studnet(10, "anu");
		s1.displayStudent();
		Studnet s2 = new Studnet(20, "renu");
		s2.displayStudent();
	}
}
