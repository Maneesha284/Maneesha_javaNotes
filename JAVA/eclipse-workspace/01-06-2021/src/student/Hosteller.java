package student;

public class Hosteller extends Student {
	double hostelFee;
	
	Hosteller(int studentId, String name, double examFee,double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}
	
	

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}

	@Override
	double payFee(int amount) {
		System.out.println(displayDetails());
		return (super.payFee(amount) + hostelFee);
	}
	
	
	String displayDetails() {
		return toString();	
	}
	@Override
	public String toString() {
		return "Hosteller [HostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="+ examFee + "]";
	}
	
}

