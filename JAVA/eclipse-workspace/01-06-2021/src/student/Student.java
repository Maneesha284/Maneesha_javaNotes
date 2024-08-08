package student;

class Student {
	int studentId;
	String name;
	double examFee;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	String displayDetails() {
		//System.out.println("studentId=" + studentId + ", name=" + name + ", examFee=" + examFee );
		return toString();	
	}
	double payFee(int amount) {
		double fee = examFee-amount;
		return fee;
	}
}
