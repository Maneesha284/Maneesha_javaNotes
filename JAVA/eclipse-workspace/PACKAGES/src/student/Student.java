package student;

public class Student {
	private int sno;
	private String sname;
	private Address adress;

	public Student(int sno, String sname, Address adress) {
		this.sno = sno;
		this.sname = sname;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", adress=" + adress + "]";
	}

}
