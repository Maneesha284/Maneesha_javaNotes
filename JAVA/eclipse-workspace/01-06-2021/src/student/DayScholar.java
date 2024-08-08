package student;

class DayScholar extends Student {
	double transportFee;
	
	public double getTransportFee() {
		return transportFee;
	}
	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}
	
	DayScholar(int studentId, String name, double examFee,double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	double payFee(int amount) {
		return (super.payFee(amount) + transportFee) - amount;
	}
	
	
	String displayDetails() {
		return toString();	
	}
	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="+ examFee + "]";
	}
	
}
